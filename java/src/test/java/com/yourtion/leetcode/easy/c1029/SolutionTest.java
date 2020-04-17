package com.yourtion.leetcode.easy.c1029;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().twoCitySchedCost(ss));
    }

    @Test
    void twoCitySchedCost() {
        runTest("[[10,20],[30,200],[400,50],[30,20]]", 110);
        runTest("[[10,20],[30,200],[400,50],[30,30]]", 120);
    }
}