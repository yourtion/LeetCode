package com.yourtion.leetcode.easy.c1184;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int start, int destination, int res) {
        System.out.printf("runTest: %s %d %d , res: %d \n", source, start, destination, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().distanceBetweenBusStops(ss, start, destination));
    }

    @Test
    void distanceBetweenBusStops() {
        runTest("[1,2,3,4]", 0, 1, 1);
        runTest("[1,2,3,4]", 0, 2, 3);
        runTest("[1,2,3,4]", 0, 3, 4);
        runTest("[1,2,3,4]", 1, 3, 5);
        runTest("[3,6,7,2,9,10,7,16,11]", 6, 9, 34);
        runTest("[7,10,1,12,11,14,5,0]", 7, 2, 17);
    }
}