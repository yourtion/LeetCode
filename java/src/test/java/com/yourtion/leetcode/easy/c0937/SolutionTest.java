package com.yourtion.leetcode.easy.c0937;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String[] source, String[] res) {
        System.out.printf("runTest: %s , res: %s \n", Arrays.toString(source), Arrays.toString(res));
        String[] ret = new Solution().reorderLogFiles(source);
        Assertions.assertArrayEquals(res, ret);
    }

    @Test
    void reorderLogFiles() {
        runTest(
                new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"},
                new String[]{"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"}
        );
        runTest(
                new String[]{"j mo", "5 m w", "g 07", "o 2 0", "t q h"},
                new String[]{"5 m w", "j mo", "t q h", "g 07", "o 2 0"}
        );
    }
}