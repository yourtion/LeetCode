package com.yourtion.leetcode.easy.c9006;

/**
 * 9006. 面试题 01.01. 判定字符是否唯一
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class Solution {
    public boolean isUnique(String astr) {
        char[] arr = astr.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (astr.indexOf(arr[i], i + 1) > -1) {
                return false;
            }
        }
        return true;
    }
}
