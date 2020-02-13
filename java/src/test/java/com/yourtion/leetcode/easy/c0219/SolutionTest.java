package com.yourtion.leetcode.easy.c0219;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, boolean res) {
        System.out.printf("runTest: %s %d , res: %b \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().containsNearbyDuplicate(ss, k));
    }

    @Test
    void containsNearbyDuplicate() {
        runTest("[1,2,3,1]", 3, true);
        runTest("[1,0,1,1]", 1, true);
        runTest("[1,2,3,1,2,3]", 2, false);
    }
}