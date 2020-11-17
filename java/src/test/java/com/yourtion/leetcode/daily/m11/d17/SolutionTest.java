package com.yourtion.leetcode.daily.m11.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201117")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, 2, 0, 0, "[[0, 0],[0, 1]]"),
                arguments(2, 2, 0, 1, "[[0, 1],[0, 0],[1, 1],[1, 0]]"),
                arguments(2, 3, 1, 2, "[[1, 2],[0, 2],[1, 1],[0, 1],[1, 0],[0, 0]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void allCellsDistOrder(int r, int c, int r0, int c0, String res) {
        System.out.printf("runTest: %d %d %d %d , res: %s", r, c, r0, c0, res);
        int[][] ret = new Solution().allCellsDistOrder(r, c, r0, c0);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }
}