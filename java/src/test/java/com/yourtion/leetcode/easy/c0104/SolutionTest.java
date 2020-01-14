package com.yourtion.leetcode.easy.c0104;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().maxDepth(tn1));
    }


    @Test
    void maxDepth() {
        runTest("[3,9,20,null,null,15,7]", 3);
        runTest("[]", 0);
        runTest("[1]", 1);
        runTest("[3,9,20,null,null,15,null]", 3);
    }
}