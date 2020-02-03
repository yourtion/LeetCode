package com.yourtion.leetcode.easy.c0118;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/pascals-triangle/
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                    continue;
                }
                list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(list);
        }
        return res;
    }
}
