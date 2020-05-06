package com.yourtion.leetcode.easy.c1408;

import java.util.ArrayList;
import java.util.List;

/**
 * 1408. 数组中的字符串匹配
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/string-matching-in-an-array/
 */
public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ret = new ArrayList<>();
        for (String w : words) {
            int l = w.length();
            for (String word : words) {
                if (word.length() > l && word.lastIndexOf(w) != -1) {
                    ret.add(w);
                    break;
                }
            }
        }
        return ret;
    }
}
