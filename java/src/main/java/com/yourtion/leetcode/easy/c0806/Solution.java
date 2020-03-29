package com.yourtion.leetcode.easy.c0806;

/**
 * 806. 写字符串需要的行数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-lines-to-write-string/
 */
public class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] ret = new int[2];
        if (S.length() > 0) {
            ret[0] += 1;
        }
        int count = 0;
        for (char a : S.toCharArray()) {
            int w = widths[a - 'a'];
            if (count + w > 100) {
                ret[0] += 1;
                count = w;
            } else {
                count += w;
            }
        }
        ret[1] = count;
        return ret;
    }
}
