package com.yourtion.leetcode.easy.c1078;

/**
 * 1078. Bigram 分词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/occurrences-after-bigram/
 */
public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        StringBuilder sb = new StringBuilder();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i].equals(first)) {
                if (arr[i + 1].equals(second)) {
                    sb.append(arr[i + 2]).append(" ");
                }
            }
        }
        return sb.length() > 0 ? sb.toString().split(" ") : new String[0];
    }
}
