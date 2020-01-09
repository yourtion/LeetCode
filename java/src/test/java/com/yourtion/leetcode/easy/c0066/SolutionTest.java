package com.yourtion.leetcode.easy.c0066;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s, res: %s \n", source, res);
        int[] ret = new Solution().plusOne(TestUtils.stringToIntegerArray(source));
        assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void plusOne() {
        runTest("[1,2,3]", "[1, 2, 4]");
        runTest("[4,3,2,1]", "[4, 3, 2, 2]");
        runTest("[0]", "[1]");
        runTest("[4,3,2,9]", "[4, 3, 3, 0]");
        runTest("[4,9,9,9]", "[5, 0, 0, 0]");
        runTest("[9,9,9,9]", "[1, 0, 0, 0, 0]");
    }
}