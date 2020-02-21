package com.yourtion.leetcode.easy.c0349;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String n1, String n2, String res) {
        System.out.printf("runTest: %s %s, res: %s \n", n1, n2, res);
        int[] s1 = TestUtils.stringToIntegerArray(n1);
        int[] s2 = TestUtils.stringToIntegerArray(n2);
        int[] r = TestUtils.stringToIntegerArray(res);
        Assertions.assertArrayEquals(r, new Solution().intersection(s1, s2));
    }

    @Test
    void intersection() {
        runTest("[1,2,2,1]", "[2,2]", "[2]");
        runTest("[4,9,5]", "[9,4,9,8,4]", "[4,9]");
    }
}