package com.yourtion.leetcode.easy.c0401;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 401. 二进制手表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-watch/
 */
public class Solution {

    int countOne(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n - 1);
        }
        return sum;
    }

    List<String> getHour(int num) {
        List<String> ret = new ArrayList<>();
        if (num == 0) {
            ret.add("0");
            return ret;
        }
        if (num > 4) {
            return ret;
        }
        for (int i = 0; i < 12; i++) {
            if (countOne(i) == num) {
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }

    List<String> getMinute(int num) {
        List<String> ret = new ArrayList<>();
        if (num <= 0) {
            ret.add("00");
            return ret;
        }
        for (int i = 0; i < 60; i++) {
            if (countOne(i) == num) {
                ret.add(i < 10 ? "0" + i : String.valueOf(i));
            }
        }
        return ret;
    }

    public List<String> readBinaryWatch(int num) {
        List<String> ret = new ArrayList<>();
        if (num == 0) {
            ret.add("0:00");
            return ret;
        }
        Set<String> res = new HashSet<>();
        for (int i = 0; i <= num; i++) {
            List<String> h = getHour(i);
            List<String> m = getMinute(num - i);
            for (String hh : h) {
                for (String mm : m) {
                    res.add(hh + ":" + mm);
                }
            }
        }
        ret.addAll(res);
        return ret;
    }
}
