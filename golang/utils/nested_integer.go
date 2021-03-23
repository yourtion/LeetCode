package utils

import "strconv"

type NestedInteger struct {
	Num int
	Ns  []*NestedInteger
}

//  Return true if this NestedInteger holds a single integer, rather than a nested list.
func (n NestedInteger) IsInteger() bool {
	return n.Ns == nil
}

// Return the single integer that this NestedInteger holds, if it holds a single integer
func (n NestedInteger) GetInteger() int {
	return n.Num
}

// Set this NestedInteger to hold a single integer.
func (n *NestedInteger) SetInteger(value int) {
	n.Num = value
}

// Set this NestedInteger to hold a nested list and adds a nested integer to it.
func (n *NestedInteger) Add(elem NestedInteger) {
	n.Ns = append(n.Ns, &elem)
}

// Return the nested list that this NestedInteger holds, if it holds a nested list
func (n NestedInteger) GetList() []*NestedInteger {
	return n.Ns
}

func (n NestedInteger) String() string {
	ret := ""
	if n.Num > 0 {
		ret += strconv.Itoa(n.Num)
	}
	if len(n.Ns) != 0 {
		for i, v := range n.Ns {
			if i == 0 {
				ret += v.String()
			} else {
				ret += " " + v.String()
			}
			if i != len(n.Ns)-1 {
				ret += ","
			}
		}
		return "[ " + ret + " ]"
	}
	return ret
}

func ConstructorNestedInteger(s string) *NestedInteger {
	stack, cur := []*NestedInteger{}, &NestedInteger{}
	for i := 0; i < len(s); {
		switch {
		case isDigital(s[i]) || s[i] == '-':
			j := 0
			for j = i + 1; j < len(s) && isDigital(s[j]); j++ {
			}
			num, _ := strconv.Atoi(s[i:j])
			next := &NestedInteger{}
			next.SetInteger(num)
			if len(stack) > 0 {
				stack[len(stack)-1].Ns = append(stack[len(stack)-1].GetList(), next)
			} else {
				cur = next
			}
			i = j
		case s[i] == '[':
			next := &NestedInteger{}
			if len(stack) > 0 {
				stack[len(stack)-1].Ns = append(stack[len(stack)-1].GetList(), next)
			}
			stack = append(stack, next)
			i++
		case s[i] == ']':
			cur = stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			i++
		case s[i] == ',':
			i++
		}
	}
	return cur
}

func isDigital(v byte) bool {
	if v >= '0' && v <= '9' {
		return true
	}
	return false
}
