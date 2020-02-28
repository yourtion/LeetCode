package com.yourtion.leetcode.easy.c0448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] map = new int[nums.length];
        for (int n : nums) {
            map[n - 1] = 1;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map[i] == 0) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
