package com.yourtion.leetcode.easy.c0970;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 970. 强整数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/powerful-integers/
 */
public class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < bound && Math.pow(x, i) < bound; i++) {
            for (int j = 0; j < bound && Math.pow(y, j) < bound; j++) {
                int r = (int) Math.pow(x, i) + (int) Math.pow(y, j);
                if (r <= bound) {
                    set.add(r);
                } else {
                    break;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
