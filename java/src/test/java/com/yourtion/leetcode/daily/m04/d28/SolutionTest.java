package com.yourtion.leetcode.daily.m04.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().singleNumbers(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void singleNumbers() {
        runTest("[4,1,4,6]", "[6, 1]");
        runTest("[1,2,10,4,1,4,3,3]", "[2, 10]");
    }
}