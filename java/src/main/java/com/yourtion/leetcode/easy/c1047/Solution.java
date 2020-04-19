package com.yourtion.leetcode.easy.c1047;

/**
 * 1047. 删除字符串中的所有相邻重复项
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class Solution {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        while (true) {
            int l = sb.length();
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i - 1) == sb.charAt(i)) {
                    sb.deleteCharAt(i - 1);
                    sb.deleteCharAt(i - 1);
                }
            }
            if (sb.length() == l) {
                break;
            }
        }
        return sb.toString();
    }
}
