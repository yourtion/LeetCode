package com.yourtion.leetcode.easy.c1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. 最小绝对差
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-absolute-difference/
 */
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(arr);
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            d = Math.min(d, arr[i + 1] - arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == d) {
                ret.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ret;
    }
}
