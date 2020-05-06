package com.yourtion.leetcode.easy.c1399;

import java.util.Arrays;

/**
 * 1399. 统计最大组的数目
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/count-largest-group/
 */
public class Solution {
    private int getGroupNum(int n) {
        int r = 0;
        while (n > 0) {
            r += n % 10;
            n /= 10;
        }
        return r;
    }

    public int countLargestGroup(int n) {
        int[] map = new int[50];
        for (int i = 1; i <= n; i++) {
            map[getGroupNum(i)] += 1;
        }
        Arrays.sort(map);
        int k = map[map.length - 1];
        for (int i = map.length - 1; i > 0; i--) {
            if (map[i] != k) {
                return map.length - i - 1;
            }
        }
        return map.length;
    }
}
