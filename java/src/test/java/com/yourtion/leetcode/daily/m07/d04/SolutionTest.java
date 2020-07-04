package com.yourtion.leetcode.daily.m07.d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200704")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("(()", 2),
                arguments(")()())", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void longestValidParentheses(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().longestValidParentheses(source));
    }
}