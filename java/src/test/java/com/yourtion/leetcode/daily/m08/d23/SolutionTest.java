package com.yourtion.leetcode.daily.m08.d23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200823")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(5, 7, 4),
                arguments(0, 1, 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void rangeBitwiseAnd(int m, int n, int res) {
        System.out.printf("runTest: %d, %d , res: %d", m, n, res);
        Assertions.assertEquals(res, new Solution().rangeBitwiseAnd(m, n));
    }
}