package com.yourtion.leetcode.easy.c9052;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9052. 面试题22. 链表中倒数第k个节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        while (k > 0 && fast != null) {
            fast = fast.next;
            k -= 1;
        }
        ListNode ret = head;
        while (fast != null) {
            fast = fast.next;
            ret = ret.next;
        }
        return ret;
    }
}
