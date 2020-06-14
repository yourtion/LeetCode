package com.yourtion.leetcode.daily.m06.d13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200613")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 3),
                arguments(4, 5),
                arguments(5, 8)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void climbStairs(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().climbStairs(source));
    }
}