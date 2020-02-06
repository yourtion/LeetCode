package com.yourtion.leetcode.easy.c0167;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String num, int target, String res) {
        System.out.printf("runTest: %s %d, res: %b \n", num, target, res);
        int[] nums = TestUtils.stringToIntegerArray(num);
        String ret = TestUtils.integerArrayToString(new Solution().twoSum(nums, target));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void twoSum() {
        runTest("[2, 7, 11, 15]", 9, "[1, 2]");
        runTest("[-3, 0, 3, 4, 90]", 0, "[1, 3]");
    }

}