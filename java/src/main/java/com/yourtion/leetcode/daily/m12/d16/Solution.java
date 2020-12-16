package com.yourtion.leetcode.daily.m12.d16;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词规律
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/word-pattern/
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if (pattern.length() != strArr.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>(26);
        for (int i = 0; i < strArr.length; i++) {
            if (map.get(pattern.charAt(i)) == null) {
                if (map.containsValue(strArr[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), strArr[i]);
            }
            map.putIfAbsent(pattern.charAt(i), strArr[i]);
            if (!map.get(pattern.charAt(i)).equals(strArr[i])) {
                return false;
            }
        }
        return true;
    }
}
