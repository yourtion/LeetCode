package utils

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
