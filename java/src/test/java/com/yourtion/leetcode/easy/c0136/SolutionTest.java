package com.yourtion.leetcode.easy.c0136;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().singleNumber(ss));
    }

    @Test
    void singleNumber() {
        runTest("[2,2,1]", 1);
        runTest("[1]", 1);
        runTest("[4,1,2,1,2]", 4);
    }
}