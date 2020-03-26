package com.yourtion.leetcode.easy.c0748;

import java.util.ArrayList;
import java.util.List;

/**
 * 748. 最短完整词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shortest-completing-word/
 */
public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        List<Character> list = new ArrayList<>();
        for (char c : licensePlate.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                list.add(c);
            }
            if (c >= 'A' && c <= 'Z') {
                list.add(Character.toLowerCase(c));
            }
        }
        int len = Integer.MAX_VALUE;
        List<String> ret = new ArrayList<>();
        for (String w : words) {
            int[] map = new int[26];
            boolean ok = true;
            if (w.length() > len) {
                continue;
            }
            for (char c : list) {
                int i = w.indexOf(c, map[c - 'a']);
                if (i == -1) {
                    ok = false;
                    break;
                }
                map[c - 'a'] = i + 1;
            }
            if (ok) {
                if (w.length() < len) {
                    len = w.length();
                    ret.clear();
                }
                ret.add(w);
            }
        }
        return ret.get(0);
    }
}
