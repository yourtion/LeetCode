package com.yourtion.leetcode.easy.c0784;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/letter-case-permutation/
 */
public class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> r1 = new ArrayList<>();
        List<String> r2 = new ArrayList<>();
        r1.add("");
        char[] arr = S.toCharArray();
        for (char c : arr) {
            List<String> r = r1.isEmpty() ? r2 : r1;
            List<String> temp = r1.isEmpty() ? r1 : r2;
            for (String a : r) {
                if (Character.isLetter(c)) {
                    temp.add(a + Character.toLowerCase(c));
                    temp.add(a + Character.toUpperCase(c));
                } else {
                    temp.add(a + c);
                }
            }
            r.clear();
        }
        return r1.isEmpty() ? r2 : r1;
    }
}
