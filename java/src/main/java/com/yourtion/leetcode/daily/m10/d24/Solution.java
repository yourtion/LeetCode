package com.yourtion.leetcode.daily.m10.d24;

/**
 * 1024. 视频拼接
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/video-stitching/
 */
public class Solution {
    public int videoStitching(int[][] clips, int T) {
        int[] maxn = new int[T];
        int last = 0, ret = 0, pre = 0;
        for (int[] clip : clips) {
            if (clip[0] < T) {
                maxn[clip[0]] = Math.max(maxn[clip[0]], clip[1]);
            }
        }
        for (int i = 0; i < T; i++) {
            last = Math.max(last, maxn[i]);
            if (i == last) {
                return -1;
            }
            if (i == pre) {
                ret++;
                pre = last;
            }
        }
        return ret;
    }
}
