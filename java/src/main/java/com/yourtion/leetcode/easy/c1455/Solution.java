package com.yourtion.leetcode.easy.c1455;

/**
 * 1455. 检查单词是否为句中其他单词的前缀
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 */
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = 1;
        char[] word = searchWord.toCharArray();
        int pos = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                count += 1;
                pos = 0;
                continue;
            }
            if (pos == -1) {
                continue;
            }
            if (c == word[pos]) {
                pos += 1;
            } else {
                pos = -1;
            }
            if (pos == word.length) {
                return count;
            }
        }
        return -1;
    }
}
