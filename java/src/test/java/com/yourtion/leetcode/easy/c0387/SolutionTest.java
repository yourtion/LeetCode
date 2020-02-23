package com.yourtion.leetcode.easy.c0387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().firstUniqChar(source));
    }

    @Test
    void firstUniqChar() {
        runTest("leetcode", 0);
        runTest("loveleetcode", 2);
        runTest("leel", -1);
    }
}