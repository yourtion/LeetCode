package com.yourtion.leetcode.easy.c0704;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int target, int res) {
        System.out.printf("runTest: %s %d, res: %d \n", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().search(ss, target));
    }

    @Test
    void search() {
        runTest("[-1,0,3,5,9,12]", 9, 4);
        runTest("[-1,0,3,5,9,12]", 2, -1);
        runTest("[]", 2, -1);
        runTest("[5]", 5, 0);
    }
}