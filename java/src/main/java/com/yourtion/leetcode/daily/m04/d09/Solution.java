package com.yourtion.leetcode.daily.m04.d09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 22. 括号生成
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/generate-parentheses/
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        List<String> ret = new ArrayList<>();
        ret.add("()");
        n -= 1;
        while (n > 0) {
            Set<String> l = new HashSet<>();
            for (String s : ret) {
                for (int i = 0; i < s.length(); i++) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.insert(i, "()");
                    l.add(sb.toString());
                }
            }
            ret = new ArrayList<>(l);
            n -= 1;
        }
        return ret;
    }
}
