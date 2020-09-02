package com.yourtion.leetcode.daily.m09.d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200901")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("+100", true),
                arguments("5e2", true),
                arguments("-123", true),
                arguments("3.1416", true),
                arguments("-1E-16", true),
                arguments("0123", true),
                arguments("12e", false),
                arguments("1a3.14", false),
                arguments("1.2.3", false),
                arguments("+-5", false),
                arguments("12e+5.4", false)

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isNumber(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().isNumber(source));
    }
}