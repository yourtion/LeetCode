package com.yourtion.leetcode.easy.c1446;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 1446. LCP 07. 传递信息
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/chuan-di-xin-xi/
 */
public class Solution {
    public int numWays(int n, int[][] relation, int k) {
        // HashMap统计每个人，可以传到哪些人
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] r : relation) {
            map.putIfAbsent(r[0], new ArrayList<>());
            map.get(r[0]).add(r[1]);
        }
        // 当前可传递人，以及传到它手上方式的数量
        int[] count = new int[n];
        count[0] = 1;
        for (int i = 0; i < k; i++) {
            // 下一波可传递人，以及传到它手上的数量
            int[] count2 = new int[n];
            for (int j = 0; j < n; j++) {
                // 等于0代表没法传过来，跳过
                if (count[j] == 0) {
                    continue;
                }
                // 这里需要判空，因为存在有人不能传给其他人的情况，此时ArrayList还未创建，为空
                if (map.get(j) != null) {
                    //遍历j可以传递的那些人
                    for (Integer num : map.get(j)) {
                        // j 可以传递的人加上可以到达j的数量
                        count2[num] += count[j];
                    }
                }
            }
            count = count2;
        }
        return count[n - 1];
    }
}
