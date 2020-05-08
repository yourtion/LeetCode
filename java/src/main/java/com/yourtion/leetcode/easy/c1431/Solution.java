package com.yourtion.leetcode.easy.c1431;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ret = new ArrayList<>(candies.length);
        int max = 0;
        for (int c : candies) {
            max = Math.max(max, c);
        }
        for (int c : candies) {
            ret.add(c + extraCandies >= max);
        }
        return ret;
    }
}
