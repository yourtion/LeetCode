package com.yourtion.leetcode.easy.c1422;

/**
 * 1422. 分割字符串的最大得分
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-score-after-splitting-a-string/
 */
public class Solution {
    public int maxScore(String s) {
        int ret = 0;
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;
        for (char c : arr) {
            if (c == '1') {
                right += 1;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            char c = arr[i];
            if (c == '0') {
                left += 1;
            } else {
                right -= 1;
            }
            ret = Math.max(ret, left + right);
        }
        return ret;
    }
}
