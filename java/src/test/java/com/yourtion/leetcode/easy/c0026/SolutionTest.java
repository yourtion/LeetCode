package com.yourtion.leetcode.easy.c0026;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, int res, String resArr) {
        System.out.printf("runTest: %s, res: %s \n", source, res);
        int[] sArr = TestUtils.stringToIntegerArray(source);
        int ret = new Solution().removeDuplicates(sArr);
        assertEquals(res, ret);
        String rArr = TestUtils.integerArrayToString(sArr, ret);
        assertEquals(resArr, rArr);
    }

    @Test
    void removeDuplicatesBase() {
        runTest("[1, 2, 2]", 2, "[1, 2]");
        runTest("[0,0,1,1,1,2,2,3,3,4]", 5, "[0, 1, 2, 3, 4]");
        runTest("[-1,0,0,0,0,3,3]", 3, "[-1, 0, 3]");
    }
}
