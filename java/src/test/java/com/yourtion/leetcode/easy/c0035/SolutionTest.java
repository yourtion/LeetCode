package com.yourtion.leetcode.easy.c0035;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, int target, int res) {
        System.out.printf("runTest: %s %d, res: %d \n", source, target, res);
        assertEquals(res, new Solution().searchInsert(TestUtils.stringToIntegerArray(source), target));
    }

    @Test
    void searchInsertBase() {
        runTest("[1,3,5,6]", 5, 2);
        runTest("[1,3,5,6]", 2, 1);
        runTest("[1,3,5,6]", 7, 4);
        runTest("[1,3,5,6]", 0, 0);
        runTest("[1,3,4,5,6]", 4, 2);
        runTest("[1,3,4,5,6]", 2, 1);
        runTest("[]", 1, 0);
    }

    @Test
    void searchInsert1() {
        runTest("[1,3,5]", 4, 2);
        runTest("[2,7,8,9,10]", 9, 3);
        runTest("[1,2,4,6,8,9,10]", 10, 6);
        runTest("[1]", 1, 0);
        runTest("[2,3,5,6,9]", 7, 4);
        runTest("[2,4,5,6,7,8]", 7, 4);
    }
}