package com.yourtion.leetcode.easy.c0108;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] sArr = TestUtils.stringToIntegerArray(source);
        String ret = TestUtils.treeNodeToString(new Solution().sortedArrayToBST(sArr));
        assertEquals(res, ret);
    }


    @Test
    void sortedArrayToBST() {
        runTest("[-10, -3, 0, 5, 9]", "[0, -10, 5, null, -3, null, 9]");
        runTest("[0]", "[0]");
        runTest("[-10, -3, 0, 5, 9, 10]", "[0, -10, 9, null, -3, 5, 10]");
    }

    @Test
    void sortedArrayToBST1() {
        runTest("[]", "[]");
    }
}