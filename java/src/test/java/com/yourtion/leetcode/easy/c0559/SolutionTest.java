package com.yourtion.leetcode.easy.c0559;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDepth() {
        System.out.println("N Ary tree maxDepth: 3");
        Node root = TestUtils.buildSampleNAryTree();
        Assertions.assertEquals(3, new Solution().maxDepth(root));
    }
}