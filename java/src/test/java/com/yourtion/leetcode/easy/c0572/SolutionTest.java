package com.yourtion.leetcode.easy.c0572;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s, String t, boolean res) {
        System.out.printf("runTest: %s %s, res: %b \n", s, t, res);
        TreeNode sn = TestUtils.stringToTreeNode(s);
        TreeNode tn = TestUtils.stringToTreeNode(t);
        Assertions.assertEquals(res, new Solution().isSubtree(sn, tn));
    }

    @Test
    void isSubtree() {
        runTest("[3,4,5,1,2]", "[4,1,2]", true);
        runTest("[3,4,5,1,2,null,null,null,null,0]", "[4,1,2]", false);
        runTest("[3,4,5,1]", "[4,1]", true);
        runTest("[1,1]", "[1]", true);
        runTest("[3,4,5,1,null,2]", "[3,1,2]", false);
    }
}