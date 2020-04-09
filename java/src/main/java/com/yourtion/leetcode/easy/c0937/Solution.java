package com.yourtion.leetcode.easy.c0937;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 937. 重新排列日志文件
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reorder-data-in-log-files/
 */
public class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> numLog = new ArrayList<>();
        SortedMap<String, String> map = new TreeMap<>();
        for (String l : logs) {
            boolean split = false;
            int i = 0;
            for (char c : l.toCharArray()) {
                i += 1;
                if (!split) {
                    if (c == ' ') {
                        split = true;
                    }
                    continue;
                }
                if (Character.isDigit(c)) {
                    numLog.add(l);
                } else {
                    String key = l.substring(i - 1) + l.substring(0, i - 1);
                    map.put(key, l);
                }
                break;
            }
        }
        int a = 0;
        for (String s : map.values()) {
            logs[a++] = s;
        }
        for (String s : numLog) {
            logs[a++] = s;
        }
        return logs;
    }
}
