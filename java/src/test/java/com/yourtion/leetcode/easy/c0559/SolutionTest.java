package com.yourtion.leetcode.easy.c0559;

import com.yourtion.leetcode.utils.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class SolutionTest {

    void runTest(Node source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        Assertions.assertEquals(res, new Solution().maxDepth(source));
    }

    @Test
    void maxDepth() {
        List<Node> c = new LinkedList<>();
        c.add(new Node(5));
        c.add(new Node(6));
        Node n1 = new Node(3, c);
        List<Node> c2 = new LinkedList<>();
        c2.add(n1);
        c2.add(new Node(2));
        c2.add(new Node(4));
        Node root = new Node(1, c2);
        runTest(root, 3);
    }
}