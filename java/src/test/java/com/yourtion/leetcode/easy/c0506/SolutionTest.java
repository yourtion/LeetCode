package com.yourtion.leetcode.easy.c0506;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, Arrays.toString(new Solution().findRelativeRanks(ss)));
    }

    @Test
    void findRelativeRanks() {
        runTest("[5, 4, 3, 2, 1]", "[Gold Medal, Silver Medal, Bronze Medal, 4, 5]");
        runTest("[4, 5, 6, 1, 2]", "[Bronze Medal, Silver Medal, Gold Medal, 5, 4]");
    }
}