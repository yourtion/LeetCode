package com.yourtion.leetcode.easy.c1313;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().decompressRLElist(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void decompressRLElist() {
        runTest("[1,2,3,4]", "[2, 4, 4, 4]");
        runTest("[1,1,2,3]", "[1, 3, 3]");
    }
}