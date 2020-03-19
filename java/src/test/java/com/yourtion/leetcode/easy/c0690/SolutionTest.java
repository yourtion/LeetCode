package com.yourtion.leetcode.easy.c0690;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    Solution.Employee build(int id, int imp, Integer[] c) {
        Solution.Employee e = new Solution.Employee();
        e.id = id;
        e.importance = imp;
        e.subordinates = Arrays.asList(c);
        return e;
    }

    @Test
    void getImportance() {
        System.out.println("runTest: getImportance");
        List<Solution.Employee> list = new ArrayList<>();
        list.add(build(1, 5, new Integer[]{2, 3}));
        list.add(build(2, 3, new Integer[0]));
        list.add(build(3, 3, new Integer[0]));
        Assertions.assertEquals(11, new Solution().getImportance(list, 1));
    }

    @Test
    void getImportance2() {
        System.out.println("runTest: getImportance2");
        List<Solution.Employee> list = new ArrayList<>();
        list.add(build(1, 5, new Integer[]{2, 3}));
        list.add(build(2, 3, new Integer[]{4}));
        list.add(build(3, 4, new Integer[0]));
        list.add(build(4, 1, new Integer[0]));
        Assertions.assertEquals(13, new Solution().getImportance(list, 1));
    }
}