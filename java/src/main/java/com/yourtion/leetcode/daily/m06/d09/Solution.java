package com.yourtion.leetcode.daily.m06.d09;

/**
 * 面试题46. 把数字翻译成字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
 */
public class Solution {
    public int translateNum(int num) {
        String src = String.valueOf(num);
        int p, q = 0, ret = 1;
        for (int i = 0; i < src.length(); ++i) {
            p = q;
            q = ret;
            ret = 0;
            ret += q;
            if (i == 0) {
                continue;
            }
            String pre = src.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
                ret += p;
            }
        }
        return ret;
    }
}
