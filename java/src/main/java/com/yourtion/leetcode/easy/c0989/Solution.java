package com.yourtion.leetcode.easy.c0989;

import java.util.ArrayList;
import java.util.List;

/**
 * 989. 数组形式的整数加法
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 */
public class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ret = new ArrayList<>();
        int carry = 0;
        int p = A.length - 1;
        // 处理加法
        while (K > 0 || carry == 1) {
            int i = p >= 0 ? A[p] : 0;
            int a = i + K % 10 + carry;
            carry = a >= 10 ? 1 : 0;
            K /= 10;
            ret.add(0, a % 10);
            p--;
        }
        // 处理剩余数据
        while (p >= 0) {
            ret.add(0, A[p--] + carry);
            carry = 0;
        }
        // 处理剩余进位
        if (carry > 0) {
            ret.add(0, carry);
        }
        return ret;
    }
}
