package com.yourtion.leetcode.easy.c0492;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        String ret = TestUtils.integerArrayToString(new Solution().constructRectangle(source));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void constructRectangle() {
        runTest(4, "[2, 2]");
        runTest(2, "[2, 1]");
        runTest(6, "[3, 2]");
        runTest(8, "[4, 2]");
        runTest(9999998, "[4999999, 2]");
    }
}