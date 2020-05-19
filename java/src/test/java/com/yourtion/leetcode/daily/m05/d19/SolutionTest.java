package com.yourtion.leetcode.daily.m05.d19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200519")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aba", true),
                arguments("abca", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void validPalindrome(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().validPalindrome(source));
    }
}