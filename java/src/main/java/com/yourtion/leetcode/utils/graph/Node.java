package com.yourtion.leetcode.utils.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int v) {
        val = v;
        neighbors = new ArrayList<>();
    }

    public Node(int v, ArrayList<Node> n) {
        val = v;
        neighbors = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Node node = (Node) o;

        if (val != node.val) {
            return false;
        }
        return Objects.equals(neighbors, node.neighbors);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (neighbors != null ? neighbors.size() : 0);
        return result;
    }
}
