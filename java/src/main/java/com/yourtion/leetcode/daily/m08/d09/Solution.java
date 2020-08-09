package com.yourtion.leetcode.daily.m08.d09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 93. 复原IP地址
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/restore-ip-addresses/
 */
public class Solution {
    private final LinkedList<String> segments = new LinkedList<>();
    private final ArrayList<String> output = new ArrayList<>();
    private int n;
    private String s;

    private boolean valid(String segment) {
        int m = segment.length();
        if (m > 3) {
            return false;
        }
        return (segment.charAt(0) != '0') ? (Integer.parseInt(segment) <= 255) : (m == 1);
    }

    private void updateOutput(int currPos) {
        String segment = s.substring(currPos + 1, n);
        if (valid(segment)) {
            segments.add(segment);
            output.add(String.join(".", segments));
            segments.removeLast();
        }
    }

    private void backtrack(int prevPos, int dots) {
        int maxPos = Math.min(n - 1, prevPos + 4);
        for (int curr_pos = prevPos + 1; curr_pos < maxPos; curr_pos++) {
            String segment = s.substring(prevPos + 1, curr_pos + 1);
            if (valid(segment)) {
                segments.add(segment);
                if (dots - 1 == 0) {
                    updateOutput(curr_pos);
                } else {
                    backtrack(curr_pos, dots - 1);
                }
                segments.removeLast();
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        this.s = s;
        backtrack(-1, 3);
        return output;
    }
}
