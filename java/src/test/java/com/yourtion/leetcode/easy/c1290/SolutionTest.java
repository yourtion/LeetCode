package com.yourtion.leetcode.easy.c1290;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        Assertions.assertEquals(res, new Solution().getDecimalValue(head));
    }

    @Test
    void getDecimalValue() {
        runTest("[1,0,1]", 5);
        runTest("[0]", 0);
        runTest("[1]", 1);
        runTest("[0,0]", 0);
        runTest("[1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]", 18880);
    }
}