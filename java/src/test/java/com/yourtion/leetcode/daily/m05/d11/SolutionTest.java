package com.yourtion.leetcode.daily.m05.d11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200511")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2.0, 10, 1024.0),
                arguments(2.10, 3, 9.261000000000001),
                arguments(2.0, -2, 0.25)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void myPow(double x, int n, double res) {
        System.out.printf("runTest: %f %d, res: %f", x, n, res);
        Assertions.assertEquals(res, new Solution().myPow(x, n));
    }
}