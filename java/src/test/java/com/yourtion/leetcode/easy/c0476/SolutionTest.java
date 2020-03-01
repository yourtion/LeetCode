package com.yourtion.leetcode.easy.c0476;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, int res) {
        System.out.printf("runTest: %d , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().findComplement(source));
    }

    @Test
    void findComplement() {
        runTest(5, 2);
        runTest(1, 0);
    }
}