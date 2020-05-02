package com.yourtion.leetcode.easy.c1346;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1346. 检查整数及其两倍数是否存在
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/check-if-n-and-its-double-exist/
 */
public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i] * 2)) {
                return true;
            }
            set.add(arr[i]);
        }
        for (int value : arr) {
            if (value >= 0) {
                break;
            }
            if (set.contains(value * 2)) {
                return true;
            }
        }
        return false;
    }
}
