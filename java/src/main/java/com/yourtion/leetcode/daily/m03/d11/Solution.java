package com.yourtion.leetcode.daily.m03.d11;

/**
 * 1013. 将数组分成和相等的三个部分
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int n : A) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int a = sum / 3;
        sum = 0;
        int c = 3;
        for (int n : A) {
            sum += n;
            if (sum == a) {
                c -= 1;
                sum = 0;
            }
        }
        return sum == 0 && c <= 0;
    }
}
