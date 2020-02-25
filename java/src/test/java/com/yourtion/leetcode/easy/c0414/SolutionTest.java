package com.yourtion.leetcode.easy.c0414;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().thirdMax(ss));
    }

    @Test
    void thirdMax() {
        runTest("[3, 2, 1]", 1);
        runTest("[1, 2]", 2);
        runTest("[2, 2, 3, 1]", 1);
        runTest("[1, 2, -2147483648]", -2147483648);
    }
}