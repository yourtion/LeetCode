package com.yourtion.leetcode.easy.c0628;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maximumProduct(ss));
    }

    @Test
    void maximumProduct() {
        runTest("[1,2,3]", 6);
        runTest("[1,2,3,4]", 24);
        runTest("[-4,-3,-2,-1,60]", 720);
    }
}