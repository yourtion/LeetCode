package com.yourtion.leetcode.easy.c0021;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String l1, String l2, String res) {
        System.out.printf("runTest: %s and %s, res: %s \n", l1, l2, res);
        ListNode ln1 = TestUtils.stringToListNode(l1);
        ListNode ln2 = TestUtils.stringToListNode(l2);
        String ret = TestUtils.listNodeToString(new Solution().mergeTwoLists(ln1, ln2));
        assertEquals(res, ret);
    }

    @Test
    void mergeTwoListsBase() {
        runTest("[1, 2, 4]", "[1, 3, 4]", "[1, 1, 2, 3, 4, 4]");
        runTest("[]", "[]", "[]");
        runTest("[1, 2, 4]", "[]", "[1, 2, 4]");
        runTest("[]", "[1, 3, 4]", "[1, 3, 4]");
        runTest("[1, 2, 4]", "[4]", "[1, 2, 4, 4]");
        runTest("[4]", "[1, 3, 4]", "[1, 3, 4, 4]");
        runTest("[1, 2, 4]", "[1, 3, 4, 5, 5, 6]", "[1, 1, 2, 3, 4, 4, 5, 5, 6]");
    }

    @Test
    void mergeTwoLists1() {
        runTest("[2]", "[1]", "[1, 2]");
    }
}