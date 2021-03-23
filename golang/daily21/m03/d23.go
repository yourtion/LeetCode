package y2021m03

import "github.com/yourtion/LeetCode/golang/utils"

type NestedInteger = utils.NestedInteger

// 每日一题 20210323
//
// 341. 扁平化嵌套列表迭代器
// Link: https://leetcode-cn.com/problems/flatten-nested-list-iterator/
type NestedIterator struct {
	stack [][]*NestedInteger
}

func ConstructorNestedIterator(nestedList []*NestedInteger) *NestedIterator {
	return &NestedIterator{[][]*NestedInteger{nestedList}}
}

func (n *NestedIterator) Next() int {
	queue := n.stack[len(n.stack)-1]
	val := queue[0].GetInteger()
	n.stack[len(n.stack)-1] = queue[1:]
	return val
}

func (n *NestedIterator) HasNext() bool {
	for len(n.stack) > 0 {
		queue := n.stack[len(n.stack)-1]
		if len(queue) == 0 { // 当前队列为空，出栈
			n.stack = n.stack[:len(n.stack)-1]
			continue
		}
		nest := queue[0]
		if nest.IsInteger() {
			return true
		}
		// 若队首元素为列表，则将其弹出队列并入栈
		n.stack[len(n.stack)-1] = queue[1:]
		n.stack = append(n.stack, nest.GetList())
	}
	return false
}
