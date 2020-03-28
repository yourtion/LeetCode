package com.yourtion.leetcode.daily.m03.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().minimumLengthEncoding(ss));
    }

    @Test
    void minimumLengthEncoding() {
        runTest("time,me,bell", 10);
        runTest("time,time,me,be,bell", 13);
    }
}