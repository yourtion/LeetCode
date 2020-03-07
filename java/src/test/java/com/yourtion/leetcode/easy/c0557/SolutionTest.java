package com.yourtion.leetcode.easy.c0557;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().reverseWords(source));
    }

    @Test
    void reverseWords() {
        runTest("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc");
    }

}