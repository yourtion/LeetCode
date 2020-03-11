package com.yourtion.leetcode.daily.m03.d11;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().canThreePartsEqualSum(ss));
    }

    @Test
    void canThreePartsEqualSum() {
        runTest("[0,2,1,-6,6,-7,9,1,2,0,1]", true);
        runTest("[0,2,1,-6,6,7,9,-1,2,0,1]", false);
        runTest("[3,3,6,5,-2,2,5,1,-9,4]", true);
        runTest("[10,-10,10,-10,10,-10,10,-10]", true);
    }
}