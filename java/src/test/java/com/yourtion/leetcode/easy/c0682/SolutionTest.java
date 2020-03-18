package com.yourtion.leetcode.easy.c0682;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().calPoints(ss));
    }

    @Test
    void calPoints() {
        runTest("5,2,C,D,+", 30);
        runTest("5,-2,4,C,D,9,+,+", 27);
    }
}