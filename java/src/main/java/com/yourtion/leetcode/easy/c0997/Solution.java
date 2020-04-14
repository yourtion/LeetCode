package com.yourtion.leetcode.easy.c0997;

/**
 * 997. 找到小镇的法官
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-the-town-judge/
 */
public class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] people = new int[N];
        for (int[] t : trust) {
            people[t[0] - 1] = -1;
            if (people[t[1] - 1] != -1) {
                people[t[1] - 1] += 1;
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
