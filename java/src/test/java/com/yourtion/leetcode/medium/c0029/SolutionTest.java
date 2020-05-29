package com.yourtion.leetcode.medium.c0029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("29. 两数相除")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(10, 3, 3),
                arguments(7, -3, -2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void divide(int dividend, int divisor, int res) {
        System.out.printf("runTest: %d %d , res: %d", dividend, divisor, res);
        Assertions.assertEquals(res, new Solution().divide(dividend, divisor));
    }
}