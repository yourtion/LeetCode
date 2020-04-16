package com.yourtion.leetcode.easy.c1022;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().sumRootToLeaf(root));
    }

    @Test
    void sumRootToLeaf() {
        runTest("[1,0,1,0,1,0,1]", 22);
        runTest("[1,0,1,0,1,1,1]", 23);
    }
}