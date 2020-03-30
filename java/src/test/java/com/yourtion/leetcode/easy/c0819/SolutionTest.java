package com.yourtion.leetcode.easy.c0819;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String source, String[] banned, String res) {
        System.out.printf("runTest: %s %s, res: %s \n", source, Arrays.toString(banned), res);
        Assertions.assertEquals(res, new Solution().mostCommonWord(source, banned));
    }

    @Test
    void mostCommonWord() {
        runTest("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}, "ball");
        runTest("Bob hit a ball, the hit BALL flew far after it was a hit.", new String[]{"hit", "ball"}, "a");
    }
}