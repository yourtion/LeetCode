package com.yourtion.leetcode.easy.c0234;

import com.yourtion.leetcode.utils.ListNode;

import java.util.Stack;

/**
 * 234. 回文链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int sum = 0;
        ListNode t = head;
        while (t != null) {
            sum += 1;
            t = t.next;
        }
        int half = sum / 2;
        t = head;
        Stack<Integer> stack = new Stack<>();
        while (half > 0) {
            stack.push(t.val);
            t = t.next;
            half -= 1;
        }
        if (sum % 2 == 1) {
            t = t.next;
        }
        while (!stack.empty()) {
            int i = stack.pop();
            if (t.val != i) {
                return false;
            }
            t = t.next;
        }
        return true;
    }
}
