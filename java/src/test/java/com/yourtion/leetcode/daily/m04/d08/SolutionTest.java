package com.yourtion.leetcode.daily.m04.d08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200408")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, 3, 1, 3),
                arguments(3, 1, 0, 1),
                arguments(38, 15, 9, 135)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void movingCount(int m, int n, int k, int res) {
        System.out.printf("runTest: %d %d %d , res: %d ", m, n, k, res);
        Assertions.assertEquals(res, new Solution().movingCount(m, n, k));
    }
}