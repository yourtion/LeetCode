package com.yourtion.leetcode.easy.c0849;

import java.util.ArrayList;
import java.util.List;

/**
 * 849. 到最近的人的最大距离
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximize-distance-to-closest-person/
 */
public class Solution {
    public int maxDistToClosest(int[] seats) {
        int ret = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                list.add(i);
            }
        }
        int last = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            ret = Math.max(ret, list.get(i) - last);
            last = list.get(i);
        }
        int s0 = seats[0] == 0 ? list.get(0) : 0;
        int s1 = seats[seats.length - 1] == 0 ? seats.length - 1 - list.get(list.size() - 1) : 0;
        return Math.max(ret / 2, Math.max(s0, s1));
    }
}
