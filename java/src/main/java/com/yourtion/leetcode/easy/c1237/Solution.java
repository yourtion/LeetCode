package com.yourtion.leetcode.easy.c1237;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1237. 找出给定方程的正整数解
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-positive-integer-solution-for-a-given-equation/
 */
public class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int x = 1; x < 1001; x++) {
            for (int y = 1; y < 1001; y++) {
                int r = customfunction.f(x, y);
                if (r == z) {
                    ret.add(Arrays.asList(x, y));
                } else if (r > z) {
                    break;
                }
            }
            if (customfunction.f(x, 1) > z) {
                break;
            }
        }
        return ret;
    }

    interface CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        int f(int x, int y);
    }

}

