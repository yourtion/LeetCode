package com.yourtion.leetcode.easy.c0665;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().checkPossibility(ss));
    }

    @Test
    void checkPossibility() {
        runTest("[4,2,3]", true);
        runTest("[4,2,1]", false);
        runTest("[3,4,2,3]", false);
    }
}