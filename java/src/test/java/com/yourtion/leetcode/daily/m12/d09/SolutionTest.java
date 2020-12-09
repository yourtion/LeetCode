package com.yourtion.leetcode.daily.m12.d09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201209")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, 2, 3),
                arguments(7, 3, 28)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void uniquePaths(int m, int n, int res) {
        System.out.printf("runTest: %d %d , res: %d", m, n, res);
        Assertions.assertEquals(res, new Solution().uniquePaths(m, n));
    }
}