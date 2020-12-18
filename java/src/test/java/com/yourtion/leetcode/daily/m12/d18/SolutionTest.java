package com.yourtion.leetcode.daily.m12.d18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201218")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abcd", "abcde", 'e'),
                arguments("", "y", 'y'),
                arguments("a", "aa", 'a'),
                arguments("ae", "aea", 'a')
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findTheDifference(String s, String t, char res) {
        System.out.printf("runTest: %s %s , res: %s", s, t, res);
        Assertions.assertEquals(res, new Solution().findTheDifference(s, t));
    }
}