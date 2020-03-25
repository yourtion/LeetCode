package com.yourtion.leetcode.easy.c0728;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/self-dividing-numbers/
 */
public class Solution {
    boolean selfDividing(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        for (char a : arr) {
            int c = (a - '0');
            if (c == 0 || n % c != 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                ret.add(i);
            }
        }
        return ret;
    }
}
