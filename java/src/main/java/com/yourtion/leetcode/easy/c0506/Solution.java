package com.yourtion.leetcode.easy.c0506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. 相对名次
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/relative-ranks/
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] np = Arrays.copyOf(nums, nums.length);
        Arrays.sort(np);
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = np.length - 1; i > -1; i--) {
            map.put(np[i], np.length - i);
        }
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            int rank = map.getOrDefault(n, -1);
            if (rank == 1) {
                sb.append("Gold Medal");
            } else if (rank == 2) {
                sb.append("Silver Medal");
            } else if (rank == 3) {
                sb.append("Bronze Medal");
            } else {
                sb.append(rank);
            }
            sb.append(",");
        }
        return sb.toString().split(",");
    }
}
