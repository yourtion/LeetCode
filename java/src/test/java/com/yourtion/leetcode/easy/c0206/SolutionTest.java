package com.yourtion.leetcode.easy.c0206;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        ListNode n = TestUtils.stringToListNode(source);
        String ret = TestUtils.listNodeToString(new Solution().reverseList(n));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void reverseList() {
        runTest("[1,2,3,4,5]", "[5, 4, 3, 2, 1]");
        runTest("[]", "[]");
    }
}