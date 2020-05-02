package com.yourtion.leetcode.daily.m04.d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200403")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("42", 42),
                arguments("   -42", -42),
                arguments("4193 with words", 4193),
                arguments("words and 987", 0),
                arguments("-91283472332", -2147483648),
                arguments("+1", 1),
                arguments("+-2", 0),
                arguments("2147483648", 2147483647),
                arguments("2147483646", 2147483646),
                arguments("-2147483647", -2147483647)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void myAtoi(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        Assertions.assertEquals(res, new Solution().myAtoi(source));
    }
}