package com.yourtion.leetcode.easy.c0226;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(source);
        String ret = TestUtils.treeNodeToString(new Solution().invertTree(tn1));
        Assertions.assertEquals(res, ret);
    }


    @Test
    void invertTree() {
        runTest("[4,2,7,1,3,6,9]", "[4, 7, 2, 9, 6, 3, 1]");
        runTest("[]", "[]");
        runTest("[1]", "[1]");
        runTest("[1,3]", "[1, null, 3]");
    }
}