package com.yourtion.leetcode.daily.m06.d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200603")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(10, 1, 10, 1.0),
                arguments(6, 1, 10, 0.6),
                arguments(21, 17, 10, 0.7327777870686083)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void new21Game(int n, int k, int w, double res) {
        System.out.printf("runTest: %d %d %d , res: %f", n, k, w, res);
        Assertions.assertEquals(res, new Solution().new21Game(n, k, w));
    }
}