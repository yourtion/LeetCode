package com.yourtion.leetcode.easy.c1175;

/**
 * 1175. 质数排列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/prime-arrangements/
 */
public class Solution {
    private boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 ||
                x == 13 || x == 17 || x == 19 || x == 23 || x == 29 ||
                x == 31 || x == 37 || x == 41 || x == 43 || x == 47 ||
                x == 53 || x == 59 || x == 61 || x == 67 || x == 71 ||
                x == 73 || x == 79 || x == 83 || x == 89 || x == 97);
    }

    public int numPrimeArrangements(int n) {
        int p = 0;
        for (int i = 1; i <= n; i++) {
            p += isSmallPrime(i) ? 1 : 0;
        }
        int np = n - p;
        long ret = 1;
        for (int i = 1; i <= p; i++) {
            ret = (ret * i) % 1000000007;
        }
        for (int i = 1; i <= np; i++) {
            ret = (ret * i) % 1000000007;
        }
        return (int) ret;
    }
}
