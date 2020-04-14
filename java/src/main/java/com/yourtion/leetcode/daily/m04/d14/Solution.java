package com.yourtion.leetcode.daily.m04.d14;

import com.yourtion.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 445. 两数相加 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-two-numbers-ii/
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode l = l1;
        while (l != null) {
            list1.add(l.val);
            l = l.next;
        }
        l = l2;
        while (l != null) {
            list2.add(l.val);
            l = l.next;
        }
        int i1 = list1.size() - 1;
        int i2 = list2.size() - 1;
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        while (i1 >= 0 || i2 >= 0 || carry > 0) {
            int a = i1 >= 0 ? list1.get(i1--) : 0;
            int b = i2 >= 0 ? list2.get(i2--) : 0;
            int c = a + b + carry;
            carry = c >= 10 ? 1 : 0;
            list.add(0, c % 10);
        }
        ListNode ret = new ListNode(-1);
        l = ret;
        for (int ll : list) {
            l.next = new ListNode(ll);
            l = l.next;
        }
        return ret.next;
    }
}
