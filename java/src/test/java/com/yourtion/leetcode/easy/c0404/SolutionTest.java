package com.yourtion.leetcode.easy.c0404;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().sumOfLeftLeaves(tn));
    }

    @Test
    void sumOfLeftLeaves() {
        runTest("[3,9,20,null,null,15,7]", 24);
        runTest("[3,9,20,6,null,15,7]", 21);
        runTest("[]", 0);
        runTest("[1]", 0);

    }
}