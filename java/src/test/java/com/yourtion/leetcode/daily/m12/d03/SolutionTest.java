package com.yourtion.leetcode.daily.m12.d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201203")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(10, 4),
                arguments(12, 5),
                arguments(100, 25),
                arguments(2, 0),
                arguments(499979, 41537),
                arguments(1500000, 114155)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countPrimes(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().countPrimes(source));
    }
}