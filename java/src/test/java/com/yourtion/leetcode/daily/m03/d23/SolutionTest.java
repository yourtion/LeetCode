package com.yourtion.leetcode.daily.m03.d23;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        ListNode n = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().middleNode(n);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }

    @Test
    void middleNode() {
        runTest("[1,2,3,4,5]", "[3, 4, 5]");
        runTest("[1,2,3,4,5,6]", "[4, 5, 6]");
        runTest("[]", "[]");
    }
}