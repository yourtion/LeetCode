package com.yourtion.leetcode.easy.c0674;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findLengthOfLCIS(ss));
    }

    @Test
    void findLengthOfLCIS() {
        runTest("[1,3,5,4,7]", 3);
        runTest("[2,2,2,2,2]", 1);
        runTest("[1,3,5,7]", 4);
        runTest("[]", 0);
        runTest("[1,3,5,4,2,3,4,5]", 4);
    }
}