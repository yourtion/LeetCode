package com.yourtion.leetcode.daily.m03.d27;

import java.util.HashMap;
import java.util.Map;

/**
 * 914. 卡牌分组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class Solution {
    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int n : deck) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int g = -1;
        for (int n : map.values()) {
            if (g == -1) {
                g = n;
            } else {
                g = gcd(g, n);
            }

        }
        return g >= 2;
    }
}
