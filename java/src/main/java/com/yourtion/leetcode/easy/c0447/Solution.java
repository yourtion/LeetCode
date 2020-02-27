package com.yourtion.leetcode.easy.c0447;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. 回旋镖的数量
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-boomerangs/
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>(128);
        int count = 0;
        for (int[] i : points) {
            map.clear();
            for (int[] j : points) {
                if (i == j) {
                    continue;
                }
                int dis = (i[0] - j[0]) * (i[0] - j[0]) + (i[1] - j[1]) * (i[1] - j[1]);
                count += map.getOrDefault(dis, 0) * 2;
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
        }
        return count;
    }
}
