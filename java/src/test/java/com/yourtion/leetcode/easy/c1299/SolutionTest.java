package com.yourtion.leetcode.easy.c1299;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().replaceElements(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void replaceElements() {
        runTest("[17,18,5,4,6,1]", "[18, 6, 6, 6, 1, -1]");
        runTest("[5,4,3]", "[4, 3, -1]");
    }
}