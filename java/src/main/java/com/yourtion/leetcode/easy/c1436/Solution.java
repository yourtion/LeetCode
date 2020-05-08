package com.yourtion.leetcode.easy.c1436;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1436. 旅行终点站
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/destination-city/
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>(paths.size());
        for (List<String> p : paths) {
            set.add(p.get(0));
        }
        for (List<String> p : paths) {
            if (!set.contains(p.get(1))) {
                return p.get(1);
            }
        }
        return "";
    }
}
