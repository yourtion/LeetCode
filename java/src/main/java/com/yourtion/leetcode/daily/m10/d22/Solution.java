package com.yourtion.leetcode.daily.m10.d22;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. 划分字母区间
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/partition-labels/
 */
public class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int length = S.length();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }
}
