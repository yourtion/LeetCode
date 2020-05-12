package com.yourtion.leetcode.easy.c9024;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9024. 面试题 02.02. 返回倒数第 k 个节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */
public class Solution {
    public int kthToLast(ListNode head, int k) {
        int sum = 0;
        ListNode n = head;
        while (n != null) {
            sum += 1;
            n = n.next;
        }
        sum -= k;
        n = head;
        while (sum > 0) {
            n = n.next;
            sum -= 1;
        }
        return n.val;
    }
}
