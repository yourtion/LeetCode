package com.yourtion.leetcode.daily.m09.d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200903")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(4, "[[.Q.., ...Q, Q..., ..Q.], [..Q., Q..., ...Q, .Q..]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void solveNQueens(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        List<List<String>> ret = new Solution().solveNQueens(source);
        Assertions.assertEquals(res, ret.toString());
    }
}