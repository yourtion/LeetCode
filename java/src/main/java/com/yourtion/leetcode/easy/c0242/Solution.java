package com.yourtion.leetcode.easy.c0242;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-anagram/
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(32);
        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), 0);
            map.putIfAbsent(t.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        for (int n : map.values()) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
