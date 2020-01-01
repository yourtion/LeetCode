package com.yourtion.leetcode.easy.c001;

import org.junit.jupiter.api.Test;

import static com.yourtion.leetcode.TestUtils.stringToIntegerArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    void runTest(String num, int target, String res) {
        int[] nums = stringToIntegerArray(num);
        int[] resArr = stringToIntegerArray(res);
        assertArrayEquals(resArr, new Solution().twoSum(nums, target));
    }

    @Test
    void twoSumBase() {
        runTest("[2, 7, 11, 15]", 26, "[2, 3]");
    }

    @Test
    void twoSum2() {
        runTest("[-3, 4, 3, 90]", 0, "[0, 2]");
    }
}