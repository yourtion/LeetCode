package com.yourtion.leetcode.easy.c0088;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String nums1, int m, String nums2, int n, String res) {
        System.out.printf("runTest: %s %d, %s %d res: %s \n", nums1, m, nums2, n, res);
        int[] num1Arr = TestUtils.stringToIntegerArray(nums1);
        int[] num2Arr = TestUtils.stringToIntegerArray(nums2);
        new Solution().merge(num1Arr, m, num2Arr, n);
        assertEquals(res, TestUtils.integerArrayToString(num1Arr, m + n));
    }

    @Test
    void merge() {
        runTest("[1, 2, 3, 0, 0, 0]", 3, "[2, 5, 6]", 3, "[1, 2, 2, 3, 5, 6]");
        runTest("[0, 0, 0]", 0, "[2, 5, 6]", 3, "[2, 5, 6]");
        runTest("[1, 2, 3]", 3, "[]", 0, "[1, 2, 3]");

    }
}