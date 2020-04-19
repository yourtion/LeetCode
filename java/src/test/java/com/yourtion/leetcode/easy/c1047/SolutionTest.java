package com.yourtion.leetcode.easy.c1047;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().removeDuplicates(source));
    }

    @Test
    void removeDuplicates() {
        runTest("abbaca", "ca");
        runTest("abbca", "aca");
        runTest("azxxzy", "ay");
        runTest("aaaaaaaa", "");
    }
}