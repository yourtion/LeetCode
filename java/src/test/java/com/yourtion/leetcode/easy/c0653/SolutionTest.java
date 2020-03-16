package com.yourtion.leetcode.easy.c0653;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int n, boolean res) {
        System.out.printf("runTest: %s %d, res: %b \n", source, n, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().findTarget(root, n));
    }

    @Test
    void findTarget() {
//        runTest("[3,5,6,2,4,null,7]", 9, true);
//        runTest("[3,5,6,2,4,null,7]", 28, false);
//        runTest("[3,5]", 8, true);
//        runTest("[2,1,3]",4 , true);
        runTest("[2,0,3,-4,1]", -1, true);
    }
}