package com.yourtion.leetcode.easy.c1451;

import java.util.HashSet;
import java.util.Set;

/**
 * 1451. LCP 11. 期望个数统计
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/qi-wang-ge-shu-tong-ji/
 */
public class Solution {
    public int expectNumber(int[] scores) {
        Set<Integer> set = new HashSet<>();
        for (int s : scores) {
            set.add(s);
        }
        return set.size();
    }
}
