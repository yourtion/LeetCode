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

func LinkedListCombine(headA, headB *ListNode, skip1, skip2 int) {
	h1 := headA
	h2 := headB
	for i := 0; i < skip1-1; i++ {
		h1 = h1.Next
	}
	for i := 0; i < skip2-1; i++ {
		h2 = h2.Next
	}
	if h1.Next != nil && h2.Next != nil {
		h1.Next = h2.Next
	}
}

func (head *ListNode) String() string {
	ret := ""
	cur := head
	for cur != nil {
		ret += " -> " + strconv.Itoa(cur.Val)
		cur = cur.Next
	}
	if len(ret) >= 4 {
		ret = ret[4:]
	}
	return "ListNode{ " + ret + " }"
}
