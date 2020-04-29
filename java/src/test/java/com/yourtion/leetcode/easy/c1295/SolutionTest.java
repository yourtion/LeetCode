package com.yourtion.leetcode.easy.c1295;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findNumbers(ss));
    }

    @Test
    void findNumbers() {
        runTest("[12,345,2,6,7896]", 2);
        runTest("[555,901,482,1771]", 1);
    }
}