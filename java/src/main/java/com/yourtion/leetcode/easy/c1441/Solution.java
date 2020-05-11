package com.yourtion.leetcode.easy.c1441;

import java.util.ArrayList;
import java.util.List;

/**
 * 1441. 用栈操作构建数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/build-an-array-with-stack-operations/
 */
public class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i = 1;
        int pos = 0;
        List<String> ret = new ArrayList<>();
        while (i <= n && pos < target.length) {
            if (target[pos] == i) {
                ret.add("Push");
                pos += 1;
            } else {
                ret.add("Push");
                ret.add("Pop");
            }
            i += 1;
        }
        return ret;
    }
}
