package com.yourtion.leetcode.daily.m09.d05;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. 第k个排列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/permutation-sequence/
 */
public class Solution {
    public String getPermutation(int n, int k) {
        int[] factorials = new int[n];
        List<Integer> nums = new ArrayList<>();
        nums.add(1);

        factorials[0] = 1;
        for (int i = 1; i < n; ++i) {
            factorials[i] = factorials[i - 1] * i;
            nums.add(i + 1);
        }
        k -= 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i > -1; --i) {
            int idx = k / factorials[i];
            k -= idx * factorials[i];

            sb.append(nums.get(idx));
            nums.remove(idx);
        }
        return sb.toString();
    }
}
