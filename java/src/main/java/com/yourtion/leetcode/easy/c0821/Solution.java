package com.yourtion.leetcode.easy.c0821;

import java.util.ArrayList;
import java.util.List;

/**
 * 821. 字符的最短距离
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shortest-distance-to-a-character/
 */
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ret = new int[S.length()];
        List<Integer> list = new ArrayList<>();
        char[] ss = S.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == C) {
                list.add(i);
            }
        }
        int index = 0;
        for (int i = 0; i < ss.length; i++) {
            if (index < list.size() - 1) {
                ret[i] = Math.min(Math.abs(list.get(index) - i), Math.abs(list.get(index + 1) - i));
            } else {
                ret[i] = Math.abs(list.get(index) - i);
            }
            if (index + 1 < list.size() && list.get(index + 1) <= i) {
                index = index < list.size() - 2 ? index + 1 : list.size() - 1;
            }
        }
        return ret;
    }
}
