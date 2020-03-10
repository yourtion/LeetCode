package com.yourtion.leetcode.easy.c0590;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void postorder() {
        System.out.println("N Ary tree postorder: [5, 6, 3, 2, 4, 1]");
        Node root = TestUtils.buildSampleNAryTree();
        List<Integer> ret = new Solution().postorder(root);
        Assertions.assertEquals("[5, 6, 3, 2, 4, 1]", TestUtils.integerArrayListToString(ret));
    }
}