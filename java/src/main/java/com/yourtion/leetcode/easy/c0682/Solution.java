package com.yourtion.leetcode.easy.c0682;

/**
 * 682. 棒球比赛
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/baseball-game/
 */
public class Solution {
    public int calPoints(String[] ops) {
        int[] table = new int[ops.length];
        int i = 0;
        for (String o : ops) {
            switch (o) {
                case "+":
                    table[i] = table[i - 1] + table[i - 2];
                    i += 1;
                    break;
                case "D":
                    table[i] = table[i - 1] * 2;
                    i += 1;
                    break;
                case "C":
                    table[--i] = 0;
                    break;
                default:
                    table[i++] = Integer.parseInt(o);
            }
        }
        int ret = 0;
        for (int j = 0; j < i; j++) {
            ret += table[j];
        }
        return ret;
    }
}
