package com.yourtion.leetcode.easy.c0119;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/pascals-triangle-ii/
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                    continue;
                }
                list.add(res.get(j - 1) + res.get(j));
            }
            res = list;
        }
        return res;
    }
}