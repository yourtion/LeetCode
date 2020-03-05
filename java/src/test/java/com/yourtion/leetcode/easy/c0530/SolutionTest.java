package com.yourtion.leetcode.easy.c0530;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().getMinimumDifference(root));
    }

    @Test
    void getMinimumDifference() {
        runTest("[1,null,3,2]", 1);
        runTest("[236,104,701,null,227,null,911]", 9);
        runTest("[600,424,612,null,499,null,689]", 12);
    }
}