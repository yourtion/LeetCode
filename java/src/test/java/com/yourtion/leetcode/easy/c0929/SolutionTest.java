package com.yourtion.leetcode.easy.c0929;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String[] source, int res) {
        System.out.printf("runTest: %s , res: %d \n", Arrays.toString(source), res);
        Assertions.assertEquals(res, new Solution().numUniqueEmails(source));
    }

    @Test
    void numUniqueEmails() {
        runTest(new String[]{
                        "test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"},
                2);
        runTest(new String[]{
                        "test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@leetcode.com"},
                1);
    }
}