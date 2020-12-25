package com.yourtion.leetcode.daily.m12.d25;

import java.util.Arrays;

/**
 * 455. 分发饼干
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/assign-cookies/
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChildren = g.length, numOfCookies = s.length;
        int count = 0;
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }
        return count;
    }
}
