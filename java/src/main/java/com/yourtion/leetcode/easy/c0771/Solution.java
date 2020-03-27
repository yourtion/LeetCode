package com.yourtion.leetcode.easy.c0771;

/**
 * 771. 宝石与石头
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] table = new int[128];
        for (char c : S.toCharArray()) {
            table[c] += 1;
        }
        int ret = 0;
        for (char c : J.toCharArray()) {
            ret += table[c];
        }
        return ret;
    }
}
