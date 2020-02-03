package com.yourtion.leetcode.easy.c0118;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        String ret = TestUtils.int2dListToString(new Solution().generate(source));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void generate() {
        runTest(1, "[[1]]");
        runTest(2, "[[1],[1, 1]]");
        runTest(3, "[[1],[1, 1],[1, 2, 1]]");
        runTest(4, "[[1],[1, 1],[1, 2, 1],[1, 3, 3, 1]]");
        runTest(5, "[[1],[1, 1],[1, 2, 1],[1, 3, 3, 1],[1, 4, 6, 4, 1]]");
    }
}