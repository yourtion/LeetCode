package com.yourtion.leetcode.easy.c9003;

/**
 * 9003. LCP 06. 拿硬币
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/na-ying-bi/
 */
public class Solution {
    private int count(int n) {
        return n % 2 == 0 ? n / 2 : n / 2 + 1;
    }

    public int minCount(int[] coins) {
        int ret = 0;
        for (int c : coins) {
            ret += count(c);
        }
        return ret;
    }
}
