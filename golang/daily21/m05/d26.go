package y2021m05

// 每日一题 20210526
//
// 1190. 反转每对括号间的子串
// Link: https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses/
func reverseParentheses(s string) string {
	n := len(s)
	pair := make([]int, n)
	stack := []int{}
	for i, b := range s {
		if b == '(' {
			stack = append(stack, i)
		} else if b == ')' {
			j := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			pair[i], pair[j] = j, i
		}
	}

	ans := []byte{}
	for i, step := 0, 1; i < n; i += step {
		if s[i] == '(' || s[i] == ')' {
			i = pair[i]
			step = -step
		} else {
			ans = append(ans, s[i])
		}
	}
	return string(ans)
}
