package com.yourtion.leetcode.easy.c0849;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxDistToClosest(ss));
    }

    @Test
    void maxDistToClosest() {
        runTest("[1,0,0,0,1,0,1]", 2);
        runTest("[1,0,0,0,0,1,0,1]", 2);
        runTest("[1,0,0,0]", 3);
        runTest("[0,0,0,1]", 3);
    }
}