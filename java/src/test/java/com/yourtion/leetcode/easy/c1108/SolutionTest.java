package com.yourtion.leetcode.easy.c1108;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().defangIPaddr(source));
    }

    @Test
    void defangIPaddr() {
        runTest("1.1.1.1", "1[.]1[.]1[.]1");
        runTest("255.100.50.0", "255[.]100[.]50[.]0");
    }
}