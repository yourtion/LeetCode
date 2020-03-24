package com.yourtion.leetcode.easy.c0720;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 720. 词典中最长的单词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-word-in-dictionary/
 */
public class Solution {
    public String longestWord(String[] words) {
        Set<String> wordSet = new HashSet<>();
        Collections.addAll(wordSet, words);
        Arrays.sort(words, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        for (String word : words) {
            boolean good = true;
            for (int k = 1; k < word.length(); ++k) {
                if (!wordSet.contains(word.substring(0, k))) {
                    good = false;
                    break;
                }
            }
            if (good) {
                return word;
            }
        }
        return "";
    }
}
