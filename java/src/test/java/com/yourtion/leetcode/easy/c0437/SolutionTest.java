package com.yourtion.leetcode.easy.c0437;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int sum, int res) {
        System.out.printf("runTest: %s  %d , res: %d \n", source, sum, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().pathSum(root, sum));
    }

    @Test
    void pathSum() {
        runTest("[10,5,-3,3,2,null,11,3,-2,null,1]", 8, 3);
        runTest("[10,5,-3,3,2,null,11,3,-2,null,2]", 9, 1);

    }
}