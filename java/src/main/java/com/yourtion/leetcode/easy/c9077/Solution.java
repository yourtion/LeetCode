package com.yourtion.leetcode.easy.c9077;

import java.util.Arrays;

/**
 * 9077. LCP 18. 早餐组合
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/2vYnGI/
 */
public class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int ret = 0;
        int k = drinks.length;
        for (int j : staple) {
            if (j > x) {
                break;
            }
            while (k >= 1 && j + drinks[k - 1] > x) {
                k--;
            }
            ret += k;
            if (ret > 1000000007) {
                ret %= 1000000007;
            }
        }
        return ret;
    }
}
