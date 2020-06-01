package com.yourtion.leetcode.medium.c0049;

import java.util.*;

/**
 * 49. 字母异位词分组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/group-anagrams/
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            map.putIfAbsent(key, new LinkedList<>());
            List<String> l = map.get(key);
            l.add(s);
        }
        return new ArrayList<>(map.values());
    }
}
