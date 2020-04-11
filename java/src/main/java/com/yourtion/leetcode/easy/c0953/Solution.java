package com.yourtion.leetcode.easy.c0953;

/**
 * 953. 验证外星语词典
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/verifying-an-alien-dictionary/
 */
public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 1; i < words.length; i++) {
            String w1 = words[i - 1];
            String w2 = words[i];
            int k = Math.min(w1.length(), w2.length());
            for (int j = 0; j < k; j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if (c1 == c2) {
                    continue;
                }
                if (order.lastIndexOf(c1) > order.lastIndexOf(c2)) {
                    return false;
                } else {
                    break;
                }
            }
            if (w1.charAt(k - 1) == w2.charAt(k - 1) && w1.length() > w2.length()) {
                return false;
            }
        }
        return true;
    }
}
