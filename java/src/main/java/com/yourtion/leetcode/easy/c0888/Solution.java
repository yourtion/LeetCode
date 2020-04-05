package com.yourtion.leetcode.easy.c0888;

import java.util.HashSet;
import java.util.Set;

/**
 * 888. 公平的糖果交换
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/fair-candy-swap/
 */
public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int sumA = 0;
        int sumB = 0;
        for (int a : A) {
            sumA += a;
        }
        for (int b : B) {
            set.add(b);
            sumB += b;
        }
        int c = (sumA + sumB) / 2 - sumA;
        for (int a : A) {
            if (set.contains(a + c)) {
                return new int[]{a, a + c};
            }
        }
        return new int[]{0, 0};
    }
}
