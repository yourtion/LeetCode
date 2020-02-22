package com.yourtion.leetcode.easy.c0383;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. 赎金信
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/ransom-note/
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int m = map.getOrDefault(c, 0);
            if (m < 1) {
                return false;
            }
            map.put(c, m - 1);
        }
        return true;
    }
}
