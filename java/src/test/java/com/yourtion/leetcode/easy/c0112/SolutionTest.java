package com.yourtion.leetcode.easy.c0112;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int sum, boolean res) {
        System.out.printf("runTest: %s -> %d, res: %b \n", source, sum, res);
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().hasPathSum(tn, sum));
    }

    @Test
    void hasPathSum() {
        runTest("[5,4,8,11,null,13,4,7,2,null,null,null,1]", 22, true);
        runTest("[]", 1, false);
        runTest("[5]", 5, true);
        runTest("[1,2]", 3, true);
        runTest("[-2,null,-3]", -5, true);
    }
}