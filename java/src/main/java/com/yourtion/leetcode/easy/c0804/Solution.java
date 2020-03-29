package com.yourtion.leetcode.easy.c0804;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/unique-morse-code-words/
 */
public class Solution {
    private static final String[] MAP = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> ret = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(MAP[c - 'a']);
            }
            ret.add(sb.toString());
        }
        return ret.size();
    }
}
