package com.yourtion.leetcode.easy.c1389;

import java.util.ArrayList;
import java.util.List;

/**
 * 1389. 按既定顺序创建目标数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 */
public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
