package com.yourtion.leetcode.easy.c1089;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().duplicateZeros(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }

    @Test
    void duplicateZeros() {
        runTest("[1,0,2,3,0,4,5,0]", "[1, 0, 0, 2, 3, 0, 0, 4]");
        runTest("[1,2,3]", "[1, 2, 3]");
    }
}