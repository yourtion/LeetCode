package com.yourtion.leetcode.easy.c0100;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String tree1, String tree2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", tree1, tree2, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(tree1);
        TreeNode tn2 = TestUtils.stringToTreeNode(tree2);
        assertEquals(res, new Solution().isSameTree(tn1, tn2));
    }

    @Test
    void isSameTree() {
        runTest("[1,2,3]", "[1,2,3]", true);
        runTest("[1,2]", "[1,null,2]", false);
        runTest("[1,2,1]", "[1,1,2]", false);

    }
}