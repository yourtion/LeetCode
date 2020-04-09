package com.yourtion.leetcode.daily.m04.d09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        List<String> ret = new Solution().generateParenthesis(source);
        Assertions.assertEquals(res, Arrays.toString(ret.toArray()));
    }

    @Test
    void generateParenthesis() {
        runTest(1, "[()]");
        runTest(2, "[()(), (())]");
        runTest(3, "[()()(), ()(()), (()()), (())(), ((()))]");
    }
}