package com.yourtion.leetcode.easy.c0747;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().dominantIndex(ss));
    }

    @Test
    void dominantIndex() {
        runTest("[3, 6, 1, 0]", 1);
        runTest("[1, 2, 3, 4]", -1);
        runTest("[]", -1);
        runTest("[0,0,0,1]", 3);
    }
}