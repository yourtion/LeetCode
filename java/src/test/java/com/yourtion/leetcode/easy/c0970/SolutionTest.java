package com.yourtion.leetcode.easy.c0970;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(int x, int y, int bound, String res) {
        System.out.printf("runTest: %d %d %d , res: %s \n", x, y, bound, res);
        List<Integer> ret = new Solution().powerfulIntegers(x, y, bound);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }

    @Test
    void powerfulIntegers() {
        runTest(2, 3, 10, "[2, 3, 4, 5, 7, 9, 10]");
        runTest(3, 5, 15, "[2, 4, 6, 8, 10, 14]");
        runTest(4, 40, 100, "[17, 65, 2, 5, 56, 41, 44]");
    }
}