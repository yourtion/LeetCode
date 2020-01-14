package com.yourtion.leetcode.easy.c0101;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    void runTest(String tree, boolean res) {
        System.out.printf("runTest: %s, res: %b \n", tree, res);
        TreeNode tn = TestUtils.stringToTreeNode(tree);
        assertEquals(res, new Solution().isSymmetric(tn));
    }

    @Test
    void isSymmetric() {
        runTest("[1,2,2,3,4,4,3]", true);
        runTest("[1,2,2,null,3,null,3]", false);
    }

    @Test
    void isSymmetric1() {
        runTest("[1,2,3]", false);
    }
}