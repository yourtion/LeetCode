package com.yourtion.leetcode.easy.c1237;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(Solution.CustomFunction f, int z, String res) {
        System.out.printf("runTest: %s %d,  res: %s \n", f, z, res);
        List<List<Integer>> ret = new Solution().findSolution(f, z);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }

    @Test
    void findSolution() {
        runTest(new F1(), 5, "[[1, 4],[2, 3],[3, 2],[4, 1]]");
        runTest(new F2(), 5, "[[1, 5],[5, 1]]");
        runTest(new F2(), 6, "[[1, 6],[2, 3],[3, 2],[6, 1]]");

    }

    static class F1 implements Solution.CustomFunction {
        @Override
        public int f(int x, int y) {
            return x + y;
        }

        public String toString() {
            return "f(x,y) -> x + y";
        }
    }

    static class F2 implements Solution.CustomFunction {
        @Override
        public int f(int x, int y) {
            return x * y;
        }

        public String toString() {
            return "f(x,y) -> x * y";
        }
    }
}