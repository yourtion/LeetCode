package com.yourtion.leetcode.daily.m12.d10;

/**
 * 860. 柠檬水找零
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/lemonade-change/
 */
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5 = 0;
        int c10 = 0;
        for (int b : bills) {
            if (b == 5) {
                c5 += 1;
                continue;
            }
            if (b == 10) {
                if (c5 == 0) {
                    return false;
                }
                c5 -= 1;
                c10 += 1;
            }
            if (b == 20) {
                if (c10 > 0) {
                    if (c5 > 0) {
                        c10 -= 1;
                        c5 -= 1;
                        continue;
                    }
                    return false;
                }
                if (c5 >= 3) {
                    c5 -= 3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
