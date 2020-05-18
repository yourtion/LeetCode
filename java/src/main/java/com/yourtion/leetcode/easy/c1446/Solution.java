package com.yourtion.leetcode.easy.c1446;

/**
 * 1446. 连续字符
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/consecutive-characters/
 */
public class Solution {
    public int maxPower(String s) {
        int ret = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        char c = chars[0];
        for (char aChar : chars) {
            if (aChar == c) {
                count += 1;
            } else {
                c = aChar;
                ret = Math.max(ret, count);
                count = 1;
            }
        }
        return Math.max(ret, count);
    }
}
