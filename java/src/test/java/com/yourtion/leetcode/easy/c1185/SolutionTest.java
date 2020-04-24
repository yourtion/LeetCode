package com.yourtion.leetcode.easy.c1185;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int day, int month, int year, String res) {
        System.out.printf("runTest: %d %d %d  , res: %s \n", year, month, day, res);
        Assertions.assertEquals(res, new Solution().dayOfTheWeek(day, month, year));
    }

    @Test
    void dayOfTheWeek() {
        runTest(31, 8, 2019, "Saturday");
        runTest(1, 1, 2019, "Tuesday");
        runTest(18, 7, 1999, "Sunday");
        runTest(15, 8, 1993, "Sunday");
        runTest(22, 4, 2020, "Wednesday");
    }
}