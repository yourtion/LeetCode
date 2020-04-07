package com.yourtion.leetcode.easy.c0917;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().reverseOnlyLetters(source));
    }

    @Test
    void reverseOnlyLetters() {
        runTest("ab-cd", "dc-ba");
        runTest("a-bC-dEf-ghIj", "j-Ih-gfE-dCba");
        runTest("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!");
    }
}