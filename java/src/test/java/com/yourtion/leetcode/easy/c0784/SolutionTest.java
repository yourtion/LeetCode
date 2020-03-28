package com.yourtion.leetcode.easy.c0784;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        List<String> ret = new Solution().letterCasePermutation(source);
        Assertions.assertEquals(res, ret.toString());
    }

    @Test
    void letterCasePermutation() {
        runTest("a1b2", "[a1b2, a1B2, A1b2, A1B2]");
        runTest("3z4", "[3z4, 3Z4]");
        runTest("12345", "[12345]");
    }
}