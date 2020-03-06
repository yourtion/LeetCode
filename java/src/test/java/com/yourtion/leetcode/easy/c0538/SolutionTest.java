package com.yourtion.leetcode.easy.c0538;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().convertBST(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }

    @Test
    void convertBST() {
        runTest("[5,2,13]", "[18, 20, 13]");
        runTest("[5,2,13,null,4]", "[18, 24, 13, null, 22]");
    }
}