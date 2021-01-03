// 每日一题 20210103
// 86. 分隔链表
// Link: https://leetcode-cn.com/problems/partition-list/
package y2021m01

import "github.com/yourtion/LeetCode/golang/utils"

type ListNode = utils.ListNode

func partition(head *ListNode, x int) *ListNode {
	// 小于 x 的结果
	less := &ListNode{Val: -1}
	lessHead := less
	// 大于 x 的结果
	more := &ListNode{Val: x}
	moreHead := more
	for head != nil {
		if head.Val < x {
			// 如果小于 x 则加入小链表
			// less.Next = head
			less.Next = &ListNode{Val: head.Val}
			less = less.Next
		} else {
			// 否则加入大链表
			// more.Next = head
			more.Next = &ListNode{Val: head.Val}
			more = more.Next
		}
		// 不断向后
		head = head.Next
	}
	// 将小链表与大链表连接
	// more.Next = nil
	less.Next = moreHead.Next
	// 返回小链表虚节点结果
	return lessHead.Next
}
