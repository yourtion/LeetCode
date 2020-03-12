package com.yourtion.leetcode.easy.c0599;

import java.util.HashMap;
import java.util.Map;

/**
 * 599. 两个列表的最小索引总和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }
        Map<String, Integer> map = new HashMap<>(list1.length);
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        Map<String, Integer> map2 = new HashMap<>(list1.length);
        for (int i = 0; i < list2.length; i++) {
            if (map.get(list2[i]) != null) {
                map2.put(list2[i], map.get(list2[i]) + i);
            }
        }
        int min = Integer.MAX_VALUE;
        int c = 0;
        for (int n : map2.values()) {
            if (n == min) {
                c++;
            }
            if (n < min) {
                min = n;
                c = 1;
            }
        }
        String[] ret = new String[c];
        int i = 0;
        for (Map.Entry<String, Integer> e : map2.entrySet()) {
            if (e.getValue() == min) {
                ret[i++] = e.getKey();
            }
        }
        return ret;
    }
}
