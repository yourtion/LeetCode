package com.yourtion.leetcode.easy.c0581;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findUnsortedSubarray(ss));
    }

    @Test
    void findUnsortedSubarray() {
        runTest("[2,6,4,8,10,9,15]", 5);
        runTest("[2,3,6,4,8,10,9,13,15]", 5);
        runTest("[2,3,15]", 0);
        runTest("[2,3,15,14]", 2);
        runTest("[2, 2,6,4,8,10,9,15,15]", 5);
        runTest("[4,5,2,1,16,14,15]", 7);
        runTest("[4,5,2,1,14,15]", 4);
    }
}