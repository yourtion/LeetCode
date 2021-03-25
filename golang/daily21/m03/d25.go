package y2021m03

// 每日一题 20210325
//
// 82. 删除排序链表中的重复元素 II
// Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
func deleteDuplicates(head *ListNode) *ListNode {
	if head == nil {
		return nil
	}
	ret := &ListNode{Next: head}
	cur := ret
	for cur.Next != nil && cur.Next.Next != nil {
		if cur.Next.Val == cur.Next.Next.Val {
			x := cur.Next.Val
			for cur.Next != nil && cur.Next.Val == x {
				cur.Next = cur.Next.Next
			}
		} else {
			cur = cur.Next
		}
	}
	return ret.Next
}
