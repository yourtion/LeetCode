package com.yourtion.leetcode.daily.m03.d30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200330")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(5, 3, 3),
                arguments(10, 17, 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void lastRemaining(int n, int m, int res) {
        System.out.printf("runTest: %d %d , res: %d ", n, m, res);
        Assertions.assertEquals(res, new Solution().lastRemaining(n, m));
    }
}