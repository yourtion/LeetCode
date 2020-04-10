package com.yourtion.leetcode.easy.c0944;

/**
 * 944. 删列造序
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/delete-columns-to-make-sorted/
 */
public class Solution {
    public int minDeletionSize(String[] A) {
        int ret = 0;
        for (int i = 0; i < A[0].length(); i++) {
            char tmp = 'a';
            for (String a : A) {
                if (a.charAt(i) < tmp) {
                    ret += 1;
                    break;
                }
                tmp = a.charAt(i);
            }
        }
        return ret;
    }
}
