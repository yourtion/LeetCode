package com.yourtion.leetcode.easy.c0589;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void preorder() {
        System.out.println("N tree preorder: [1, 3, 5, 6, 2, 4]");
        Node root = TestUtils.buildSampleNAryTree();
        List<Integer> ret = new Solution().preorder(root);
        Assertions.assertEquals("[1, 3, 5, 6, 2, 4]", TestUtils.integerArrayListToString(ret));
    }
}