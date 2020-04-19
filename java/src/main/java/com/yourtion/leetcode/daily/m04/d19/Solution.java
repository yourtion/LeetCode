package com.yourtion.leetcode.daily.m04.d19;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * 466. 统计重复个数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/count-the-repetitions/
 */
public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        if (n1 == 0) {
            return 0;
        }
        int s1cnt = 0, index = 0, s2cnt = 0;
        Map<Integer, Pair<Integer, Integer>> recall = new HashMap<>();
        Pair<Integer, Integer> pre_loop, in_loop;
        while (true) {
            // 我们多遍历一个 s1，看看能不能找到循环节
            ++s1cnt;
            for (char ch : s1.toCharArray()) {
                if (ch == s2.charAt(index)) {
                    index += 1;
                    if (index == s2.length()) {
                        ++s2cnt;
                        index = 0;
                    }
                }
            }
            // 还没有找到循环节，所有的 s1 就用完了
            if (s1cnt == n1) {
                return s2cnt / n2;
            }
            // 出现了之前的 index，表示找到了循环节
            if (recall.containsKey(index)) {
                Pair<Integer, Integer> prime = recall.get(index);
                // 前 s1cnt' 个 s1 包含了 s2cnt' 个 s2
                pre_loop = new Pair<>(prime.getKey(), prime.getValue());
                // 以后的每 (s1cnt - s1cnt') 个 s1 包含了 (s2cnt - s2cnt') 个 s2
                in_loop = new Pair<>(s1cnt - prime.getKey(), s2cnt - prime.getValue());
                break;
            } else {
                recall.put(index, new Pair<>(s1cnt, s2cnt));
            }
        }
        // ans 存储的是 S1 包含的 s2 的数量，考虑的之前的 pre_loop 和 in_loop
        int ans = pre_loop.getValue() + (n1 - pre_loop.getKey()) / in_loop.getKey() * in_loop.getValue();
        // S1 的末尾还剩下一些 s1，我们暴力进行匹配
        int rest = (n1 - pre_loop.getKey()) % in_loop.getKey();
        for (int i = 0; i < rest; ++i) {
            for (char ch : s1.toCharArray()) {
                if (ch == s2.charAt(index)) {
                    ++index;
                    if (index == s2.length()) {
                        ++ans;
                        index = 0;
                    }
                }
            }
        }
        // S1 包含 ans 个 s2，那么就包含 ans / n2 个 S2
        return ans / n2;
    }
}
