package com.yourtion.leetcode.easy.c0027;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, int val, int res, String resArr) {
        System.out.printf("runTest: %s %d, res: %s \n", source, val, res);
        int[] sArr = TestUtils.stringToIntegerArray(source);
        int ret = new Solution().removeElement(sArr, val);
        assertEquals(res, ret);
        String rArr = TestUtils.integerArrayToString(sArr, ret);
        assertEquals(resArr, rArr);
    }

    @Test
    void removeElementBase() {
        runTest("[3,2,2,3]", 3, 2, "[2, 2]");
        runTest("[0,1,2,2,3,0,4,2]", 2, 5, "[0, 1, 3, 0, 4]");
        runTest("[]", 2, 0, "[]");
        runTest("[3,2,2,3]", 1, 4, "[3, 2, 2, 3]");
    }
}