package com.yourtion.leetcode.easy.c0412;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().fizzBuzz(source).toString());
    }

    @Test
    void fizzBuzz() {
        runTest(15, "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]");
        runTest(3, "[1, 2, Fizz]");

    }
}