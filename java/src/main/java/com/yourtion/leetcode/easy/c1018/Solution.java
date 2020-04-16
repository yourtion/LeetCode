package com.yourtion.leetcode.easy.c1018;

import java.util.ArrayList;
import java.util.List;

/**
 * 1018. 可被 5 整除的二进制前缀
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 */
public class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ret = new ArrayList<>();
        int sum = 0;
        for (int a : A) {
            sum += a;
            sum %= 10;
            ret.add(sum == 0 || sum == 5);
            sum *= 2;
        }
        return ret;
    }
}
