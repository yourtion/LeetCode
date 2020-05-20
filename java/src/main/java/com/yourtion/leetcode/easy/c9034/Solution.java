package com.yourtion.leetcode.easy.c9034;

import java.util.HashMap;
import java.util.Map;

/**
 * 9034. 面试题 16.15. 珠玑妙算
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/master-mind-lcci/
 */
public class Solution {
    public int[] masterMind(String solution, String guess) {
        int r = 0;
        int w = 0;
        Map<Character, Integer> map = new HashMap<>(4);
        for (int i = 0; i < guess.length(); i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                r += 1;
            }
            map.put(solution.charAt(i), map.getOrDefault(solution.charAt(i), 0) + 1);
        }
        for (int i = 0; i < guess.length(); i++) {
            if (map.getOrDefault(guess.charAt(i), 0) > 0) {
                w += 1;
                map.put(guess.charAt(i), map.getOrDefault(guess.charAt(i), 0) - 1);
            }
        }
        return new int[]{r, w - r};
    }
}
