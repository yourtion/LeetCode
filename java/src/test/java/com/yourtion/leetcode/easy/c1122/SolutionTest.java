package com.yourtion.leetcode.easy.c1122;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String a1, String a2, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", a1, a2, res);
        int[] s1 = TestUtils.stringToIntegerArray(a1);
        int[] s2 = TestUtils.stringToIntegerArray(a2);
        int[] ret = new Solution().relativeSortArray(s1, s2);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void relativeSortArray() {
        runTest("[2,3,1,3,2,4,6,7,9,2,19]", "[2,1,4,3,9,6]",
                "[2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]"
        );
        runTest("[2,3,1,3,2,4,6,7,9,2,19,0,22]", "[2,1,4,3,9,6]",
                "[2, 2, 2, 1, 4, 3, 3, 9, 6, 0, 7, 19, 22]"
        );
    }
}