package com.yourtion.leetcode.easy.c0888;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String a, String b, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", a, b, res);
        int[] sa = TestUtils.stringToIntegerArray(a);
        int[] sb = TestUtils.stringToIntegerArray(b);
        int[] ret = new Solution().fairCandySwap(sa, sb);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void fairCandySwap() {
        runTest("[1,1]", "[2,2]", "[1, 2]");
        runTest("[1,2]", "[2,3]", "[1, 2]");
        runTest("[2]", "[1,3]", "[2, 3]");
        runTest("[1,2,5]", "[2,4]", "[5, 4]");
    }
}