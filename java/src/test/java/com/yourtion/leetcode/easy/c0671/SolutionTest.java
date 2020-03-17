package com.yourtion.leetcode.easy.c0671;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().findSecondMinimumValue(root));
    }

    @Test
    void findSecondMinimumValue() {
        runTest("[2,2,5,null,null,5,7]", 5);
        runTest("[2,2,2]", -1);
        runTest("[2,2,5,3,4,5,7]", 3);
        runTest("[5,8,5]", 8);
    }
}