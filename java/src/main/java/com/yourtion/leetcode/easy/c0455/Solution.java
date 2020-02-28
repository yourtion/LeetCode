package com.yourtion.leetcode.easy.c0455;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 455. 分发饼干
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/assign-cookies/
 */
public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        int maxS = 0;
        SortedMap<Integer, Integer> sMap = new TreeMap<>();
        for (int ss : s) {
            sMap.put(ss, sMap.getOrDefault(ss, 0) + 1);
            maxS = Math.max(maxS, ss);
        }
        SortedMap<Integer, Integer> gMap = new TreeMap<>();
        for (int gg : g) {
            int gs = sMap.getOrDefault(gg, 0);
            if (gs > 0) {
                res += 1;
                sMap.put(gg, gs - 1);
            } else {
                gMap.put(gg, gMap.getOrDefault(gg, 0) + 1);
            }
        }
        while (gMap.size() > 0 && gMap.lastKey() != null) {
            int k = gMap.lastKey();
            int v = gMap.getOrDefault(k, 0);
            while (sMap.size() > 0 && sMap.lastKey() != null && v > 0) {
                int i = sMap.lastKey();
                int gs = sMap.getOrDefault(i, 0);
                if (gs == 0) {
                    sMap.remove(i);
                    continue;
                }
                if (i >= k && gs > 0) {
                    v -= 1;
                    sMap.put(i, gs - 1);
                    res += 1;
                } else {
                    break;
                }
            }
            gMap.remove(k);
        }
        return res;
    }
}
