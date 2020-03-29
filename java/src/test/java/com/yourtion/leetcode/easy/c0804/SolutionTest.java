package com.yourtion.leetcode.easy.c0804;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().uniqueMorseRepresentations(ss));
    }

    @Test
    void uniqueMorseRepresentations() {
        runTest("gin,zen,gig,msg", 2);
        runTest("gin,zen", 1);
    }
}