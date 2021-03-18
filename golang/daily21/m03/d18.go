package y2021m03

import "github.com/yourtion/LeetCode/golang/utils"

type ListNode = utils.ListNode

// 每日一题 20210318
//
// 92. 反转链表 II
// Link: https://leetcode-cn.com/problems/reverse-linked-list-ii/
func reverseBetween(head *ListNode, left int, right int) *ListNode {
	// 设置 dummy 是这一类问题的一般做法
	dummy := &ListNode{Val: -1}
	dummy.Next = head
	pre := dummy
	for i := 0; i < left-1; i++ {
		pre = pre.Next
	}
	cur := pre.Next
	for i := 0; i < right-left; i++ {
		next := cur.Next
		cur.Next = next.Next
		next.Next = pre.Next
		pre.Next = next
	}
	return dummy.Next
}
