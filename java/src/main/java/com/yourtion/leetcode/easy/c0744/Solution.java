package com.yourtion.leetcode.easy.c0744;

/**
 * 744. 寻找比目标字母大的最小字母
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 */
public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        char res = letters[0];
        int z = 'z' - target;
        for (char c : letters) {
            // 如果是 z 就不需要再算一轮字母
            int len = c - target;
            if (c > target && len <= min) {
                min = len;
                res = c;
                continue;
            }
            len = c == 'z' ? 0 : c - 'a';
            if (c < target && z + len < min) {
                min = z + len;
                res = c;
            }
        }
        return res;
    }
}
