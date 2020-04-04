package com.yourtion.leetcode.easy.c0872;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String r1, String r2, boolean res) {
        System.out.printf("runTest: %s %s , res: %b \n", r1, r2, res);
        TreeNode root1 = TestUtils.stringToTreeNode(r1);
        TreeNode root2 = TestUtils.stringToTreeNode(r2);
        Assertions.assertEquals(res, new Solution().leafSimilar(root1, root2));
    }

    @Test
    void leafSimilar() {
        runTest("[3,5,1,6,2,9,8,null,null,7,4]", "[3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]", true);
        runTest("[3,5,1,6,2,9,8,null,null,7,4]", "[3,5,1,6,7,4,2,null,null,null,null,null,null,9]", false);
        runTest("[3,5,1,6,2]", "[3,5,1,6]", false);
    }
}