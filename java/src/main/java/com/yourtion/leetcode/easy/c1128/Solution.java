package com.yourtion.leetcode.easy.c1128;

import java.util.HashMap;
import java.util.Map;

/**
 * 1128. 等价多米诺骨牌对的数量
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/
 */
public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ret = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] d : dominoes) {
            String key1 = d[0] + "" + d[1];
            String key2 = d[1] + "" + d[0];
            if (map.containsKey(key1) || map.containsKey(key2)) {
                ret += Math.max(map.getOrDefault(key1, 0), map.getOrDefault(key2, 0));
            }
            if (!key1.equals(key2)) {
                map.put(key1, map.getOrDefault(key1, 0) + 1);
            }
            map.put(key2, map.getOrDefault(key2, 0) + 1);
        }
        return ret;
    }
}
