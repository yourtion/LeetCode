package com.yourtion.leetcode.daily.m08.d06;

import java.util.*;

/**
 * 336. 回文对
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/palindrome-pairs/
 */
public class Solution {
    private final List<String> wordsRev = new ArrayList<>();
    private final Map<String, Integer> indices = new HashMap<>();

    public List<List<Integer>> palindromePairs(String[] words) {
        int n = words.length;
        for (String word : words) {
            wordsRev.add(new StringBuffer(word).reverse().toString());
        }
        for (int i = 0; i < n; ++i) {
            indices.put(wordsRev.get(i), i);
        }

        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int m = words[i].length();
            if (m == 0) {
                continue;
            }
            for (int j = 0; j <= m; j++) {
                if (isPalindrome(word, j, m - 1)) {
                    int leftId = findWord(word, 0, j - 1);
                    if (leftId != -1 && leftId != i) {
                        ret.add(Arrays.asList(i, leftId));
                    }
                }
                if (j != 0 && isPalindrome(word, 0, j - 1)) {
                    int rightId = findWord(word, j, m - 1);
                    if (rightId != -1 && rightId != i) {
                        ret.add(Arrays.asList(rightId, i));
                    }
                }
            }
        }
        return ret;
    }

    private boolean isPalindrome(String s, int left, int right) {
        int len = right - left + 1;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(left + i) != s.charAt(right - i)) {
                return false;
            }
        }
        return true;
    }

    private int findWord(String s, int left, int right) {
        return indices.getOrDefault(s.substring(left, right + 1), -1);
    }
}
