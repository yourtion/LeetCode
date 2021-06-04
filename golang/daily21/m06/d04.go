package y2021m06

import "github.com/yourtion/LeetCode/golang/utils"

type ListNode = utils.ListNode

// 每日一题 20210604
//
// 160. 相交链表
// Link: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
func getIntersectionNode(headA, headB *ListNode) *ListNode {
	if headA == nil || headB == nil {
		return nil
	}
	pa, pb := headA, headB
	for pa != pb {
		if pa == nil {
			pa = headB
		} else {
			pa = pa.Next
		}
		if pb == nil {
			pb = headA
		} else {
			pb = pb.Next
		}
	}
	return pa
}
