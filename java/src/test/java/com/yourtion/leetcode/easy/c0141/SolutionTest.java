package com.yourtion.leetcode.easy.c0141;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int pos, boolean res) {
        System.out.printf("runTest: %s %d, res: %b \n", source, pos, res);
        ListNode tn = TestUtils.stringToListNodeWithCycle(source, pos);
        Assertions.assertEquals(res, new Solution().hasCycle(tn));
    }

    @Test
    void hasCycle() {
        runTest("[3,2,0,-4]", 1, true);
        runTest("[3,2,0,-4]", -1, false);
        runTest("[1,2]", 0, true);
        runTest("[1]", -1, false);
        runTest("[1]", 0, true);
        runTest("[]", -1, false);
    }
}