package com.yourtion.leetcode.daily.m03.d31;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().sortArray(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void sortArray() {
        runTest("[5,2,3,1]", "[1, 2, 3, 5]");
        runTest("[5,1,1,2,0,0]", "[0, 0, 1, 1, 2, 5]");
    }
}