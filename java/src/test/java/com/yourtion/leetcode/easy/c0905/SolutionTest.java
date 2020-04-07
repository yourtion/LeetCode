package com.yourtion.leetcode.easy.c0905;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().sortArrayByParity(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }

    @Test
    void sortArrayByParity() {
        runTest("[3,1,2,4]", "[4, 2, 1, 3]");
        runTest("[2,1]", "[2, 1]");
    }
}