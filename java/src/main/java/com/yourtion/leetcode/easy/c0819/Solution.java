package com.yourtion.leetcode.easy.c0819;

import java.util.*;

/**
 * 819. 最常见的单词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/most-common-word/
 */
public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        String[] arr = paragraph.split("\\W");
        Map<String, Integer> map = new HashMap<>(16);
        for (String w : arr) {
            String a = w.toLowerCase();
            if (!a.isEmpty() && !set.contains(a)) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }
        String ret = "";
        int c = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > c) {
                c = e.getValue();
                ret = e.getKey();
            }
        }
        return ret;
    }
}
