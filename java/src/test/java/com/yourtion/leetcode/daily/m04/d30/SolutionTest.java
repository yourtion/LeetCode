package com.yourtion.leetcode.daily.m04.d30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200430")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(19, true),
                arguments(68, true),
                arguments(1, true),
                arguments(2, false),
                arguments(3, false),
                arguments(4, false),
                arguments(5, false),
                arguments(6, false),
                arguments(7, true),
                arguments(8, false),
                arguments(9, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void runTest(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b ", source, res);
        Assertions.assertEquals(res, new Solution().isHappy(source));
    }
}