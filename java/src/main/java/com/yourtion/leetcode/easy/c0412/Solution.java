package com.yourtion.leetcode.easy.c0412;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/fizz-buzz/
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String a = "";
            if (i % 3 == 0) {
                a += "Fizz";
            }
            if (i % 5 == 0) {
                a += "Buzz";
            }
            if ("".equals(a)) {
                a = String.valueOf(i);
            }
            ret.add(a);
        }
        return ret;
    }
}
