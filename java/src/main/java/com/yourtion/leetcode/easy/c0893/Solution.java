package com.yourtion.leetcode.easy.c0893;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 893. 特殊等价字符串组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/groups-of-special-equivalent-strings/
 */
public class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String a : A) {
            int[] count = new int[52];
            for (int i = 0; i < a.length(); ++i) {
                count[a.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            set.add(Arrays.toString(count));
        }
        return set.size();
    }
}
