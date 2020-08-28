package com.yourtion.leetcode.daily.m08.d28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 20200828")
class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        Assertions.assertEquals(res, new Solution().judgeCircle(source));
    }

    @Test
    void judgeCircle() {
        runTest("UD", true);
        runTest("LL", false);
    }
}