package com.yourtion.leetcode.easy.c0965;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().isUnivalTree(root));
    }

    @Test
    void isUnivalTree() {
        runTest("[1,1,1,1,1,null,1]", true);
        runTest("[2,2,2,5,2]", false);
    }
}