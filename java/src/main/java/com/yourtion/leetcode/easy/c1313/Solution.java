package com.yourtion.leetcode.easy.c1313;

/**
 * 1313. 解压缩编码列表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 */
public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i += 2) {
            c += nums[i];
        }
        int[] ret = new int[c];
        int k = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int count = nums[i];
            while (count > 0) {
                ret[k++] = nums[i + 1];
                count--;
            }
        }
        return ret;
    }
}
