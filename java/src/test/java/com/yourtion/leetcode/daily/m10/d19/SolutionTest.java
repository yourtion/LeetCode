package com.yourtion.leetcode.daily.m10.d19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201019")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("ab#c", "ad#c", true),
                arguments("ab##", "c#d#", true),
                arguments("a##c", "#a#c", true),
                arguments("a#c", "b", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void backspaceCompare(String s, String t, boolean res) {
        System.out.printf("runTest: %s %s, res: %b", s, t, res);
        Assertions.assertEquals(res, new Solution().backspaceCompare(s, t));
    }
}