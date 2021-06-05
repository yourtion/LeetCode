package y2021m06

// 每日一题 20210605
//
// 203. 移除链表元素
// Link: https://leetcode-cn.com/problems/remove-linked-list-elements/
func removeElements(head *ListNode, val int) *ListNode {
	dummy := &ListNode{}
	cur := dummy
	for head != nil {
		if head.Val != val {
			cur.Next = head
			cur = cur.Next
			head = head.Next
			cur.Next = nil
		} else {
			head = head.Next
		}
	}
	return dummy.Next
}
