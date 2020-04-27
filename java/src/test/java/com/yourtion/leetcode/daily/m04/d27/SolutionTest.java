package com.yourtion.leetcode.daily.m04.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int target, int res) {
        System.out.printf("runTest: %s %d , res: %d \n", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().search(ss, target));
    }

    @Test
    void search() {
        runTest("[4,5,6,7,0,1,2]", 0, 4);
        runTest("[4,5,6,7,0,1,2]", 3, -1);
    }
}