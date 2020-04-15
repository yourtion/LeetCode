package com.yourtion.leetcode.easy.c1010;

import java.util.HashMap;
import java.util.Map;

/**
 * 1010. 总持续时间可被 60 整除的歌曲
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 */
public class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ret = 0;
        Map<Integer, Integer> map = new HashMap<>(16);
        map.put(time[0], 1);
        for (int i = 1; i < time.length; i++) {
            int t = 1200 - time[i];
            while (t > 0) {
                if (map.containsKey(t)) {
                    ret += map.get(t);
                }
                t -= 60;
            }
            map.put(time[i], map.getOrDefault(time[i], 0) + 1);
        }
        return ret;
    }
}
