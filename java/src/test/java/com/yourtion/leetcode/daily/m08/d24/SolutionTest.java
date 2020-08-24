package com.yourtion.leetcode.daily.m08.d24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200824")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abab", true),
                arguments("aba", false),
                arguments("abcabcabcabc", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void repeatedSubstringPattern(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().repeatedSubstringPattern(source));
    }
}