package com.yourtion.leetcode.easy.c0500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        String[] ret = res.equals("") ? new String[0] : res.split(",");
        Assertions.assertArrayEquals(ret, new Solution().findWords(source.split(",")));
    }

    @Test
    void findWords() {
        runTest("Hello,Alaska,Dad,Peace", "Alaska,Dad");
        runTest("Hello,Peace", "");
        runTest("a,b", "a,b");
    }
}