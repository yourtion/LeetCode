package com.yourtion.leetcode.easy.c0205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 205. 同构字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        // 存储对应关系
        Map<Integer, Integer> map = new HashMap<>(32);
        // 存储对应字母（保证一一对应）
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            int b = t.charAt(i);
            // 获取两个字母并计算char差距
            int r = a - b;
            if (map.get(a) == null) {
                // 如果没有原始字母但已经存在同样的对应字母，返回false
                if (set.contains(b)) {
                    return false;
                }
                set.add(b);
                map.put(a, r);
            }
            // 如果对应的字母发现不一致，返回false
            if (map.get(a) != r) {
                return false;
            }
        }
        return true;
    }
}
