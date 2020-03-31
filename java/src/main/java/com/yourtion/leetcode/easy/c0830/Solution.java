package com.yourtion.leetcode.easy.c0830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830. 较大分组的位置
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/positions-of-large-groups/
 */
public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ret = new ArrayList<>();
        int start = 0;
        char[] arr = S.toCharArray();
        char tmp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp || i == arr.length - 1) {
                if (arr[i] == tmp && i == arr.length - 1) {
                    i++;
                }
                if (i - start >= 3) {
                    ret.add(new ArrayList<>(Arrays.asList(start, i - 1)));
                }
                if (i < arr.length) {
                    start = i;
                    tmp = arr[i];
                }
            }
        }
        return ret;
    }
}
