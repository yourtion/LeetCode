package com.yourtion.leetcode.easy.c0884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 884. 两句话中的不常见单词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/
 */
public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] arr1 = A.split("\\W");
        String[] arr2 = B.split("\\W");
        Map<String, Integer> map = new HashMap<String, Integer>(16);
        for (String a : arr1) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (String a : arr2) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                list.add(e.getKey());
            }
        }
        String[] ret = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
