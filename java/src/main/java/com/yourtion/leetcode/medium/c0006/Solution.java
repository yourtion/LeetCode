package com.yourtion.leetcode.medium.c0006;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Z 字形变换
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            list.add(i, new StringBuilder());
        }
        int cur = 0;
        boolean up = true;
        for (int i = 0; i < s.length(); i++) {
            list.get(cur).append(s.charAt(i));
            if (cur == 0 || cur == numRows - 1) {
                up = !up;
            }
            cur += up ? -1 : 1;
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder sb : list) {
            ret.append(sb);
        }
        return ret.toString();
    }
}
