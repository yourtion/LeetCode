package com.yourtion.leetcode.daily.m07.d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200705")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aa", "a", false),
                arguments("aa", "*", true),
                arguments("cb", "?a", false),
                arguments("acdcb", "a*c?b", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isMatch(String s, String p, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", s, p, res);
        Assertions.assertEquals(res, new Solution().isMatch(s, p));
    }
}