package com.yourtion.leetcode.easy.c0110;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String tree, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", tree, res);
        TreeNode tn = TestUtils.stringToTreeNode(tree);
        assertEquals(res, new Solution().isBalanced(tn));
    }


    @Test
    void isBalanced() {
        runTest("[3,9,20,null,null,15,7]", true);
        runTest("[1,2,2,3,3,null,null,4,4]", false);
        runTest("[]", true);
        runTest("[0]", true);
        runTest("[0, 1, 2]", true);
    }

    @Test
    void isBalanced1() {
        runTest("[1,2,2,3,null,null,3,4,null,null,4]", false);
    }
}