package com.yourtion.leetcode.easy.c0507;

import java.util.HashSet;
import java.util.Set;

/**
 * 507. 完美数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/perfect-number/
 */
public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= num; i++) {
            if (num % i != 0) {
                continue;
            }
            if (set.contains(i)) {
                break;
            }
            set.add(i);
            set.add(num / i);
        }
        int sum = 0;
        for (int n : set) {
            if (num != n) {
                sum += n;
            }
        }
        return sum == num;
    }
}
