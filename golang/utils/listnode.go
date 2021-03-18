package utils

import "strconv"

type ListNode struct {
	Val  int
	Next *ListNode
}

func NewListNode(list []int) *ListNode {
	head := &ListNode{Val: -1}
	cur := head
	for _, v := range list {
		cur.Next = &ListNode{Val: v}
		cur = cur.Next
	}
	return head.Next
}

func (head *ListNode) ToIntArr() []int {
	//goland:noinspection GoPreferNilSlice
	ret := []int{}
	n := head
	for n != nil {
		ret = append(ret, n.Val)
		n = n.Next
	}
	return ret
}

func (head *ListNode) String() string {
	ret := ""
	cur := head
	for cur.Next != nil {
		ret += " -> " + strconv.Itoa(cur.Val)
		cur = cur.Next
	}
	if len(ret) >= 4 {
		ret = ret[4:]
	}
	return "ListNode{ " + ret + " }"
}
