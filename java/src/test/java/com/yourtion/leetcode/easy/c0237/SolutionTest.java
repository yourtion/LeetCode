package com.yourtion.leetcode.easy.c0237;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int v, String res) {
        System.out.printf("runTest: %s %d , res: %s \n", source, v, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode n = head;
        while (n != null) {
            if (n.val == v) {
                new Solution().deleteNode(n);
                break;
            }
            n = n.next;
        }
        String ret = TestUtils.listNodeToString(head);
        Assertions.assertEquals(res, ret);
    }

    @Test
    void deleteNode() {
        runTest("[4,5,1,9]", 5, "[4, 1, 9]");
        runTest("[4,5,1,9]", 1, "[4, 5, 9]");
        runTest("[]", 0, "[]");

    }
}