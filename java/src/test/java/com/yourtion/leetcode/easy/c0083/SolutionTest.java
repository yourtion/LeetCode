package com.yourtion.leetcode.easy.c0083;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s, res: %s \n", source, res);
        String ret = TestUtils.listNodeToString(
                new Solution().deleteDuplicates(TestUtils.stringToListNode(source))
        );
        assertEquals(res, ret);
    }

    @Test
    void deleteDuplicates() {
        runTest("[1, 1, 2]", "[1, 2]");
        runTest("[1, 1, 2, 3, 3]", "[1, 2, 3]");
        runTest("[]", "[]");
    }
}