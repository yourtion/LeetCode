package com.yourtion.leetcode.easy.c0709;

/**
 * 709. 转换成小写字母
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/to-lower-case/
 */
public class Solution {
    public String toLowerCase(String str) {
        int dis = 'A' - 'a';
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] = (char) (c[i] - dis);
            }
        }
        return new String(c);
    }
}
