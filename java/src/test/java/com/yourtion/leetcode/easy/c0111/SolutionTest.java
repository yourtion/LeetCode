package com.yourtion.leetcode.easy.c0111;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().minDepth(tn1));
    }

    @Test
    void minDepth() {
        runTest("[3,9,20,null,null,15,7]", 2);
        runTest("[]", 0);
        runTest("[1]", 1);
        runTest("[3,9,20,10,null,15,7]", 3);
    }

    @Test
    void minDepth1() {
        runTest("[1, 2]", 2);
        runTest("[1,2,null,3,null,4,null,5]", 5);
        runTest("[-9,-3,2,null,4,4,0,-6,null,-5]", 3);
    }
}