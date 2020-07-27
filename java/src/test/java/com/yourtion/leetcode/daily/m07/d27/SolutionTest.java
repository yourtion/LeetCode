package com.yourtion.leetcode.daily.m07.d27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200727")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abc", "ahbgdc", true),
                arguments("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isSubsequence(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b", s1, s2, res);
        Assertions.assertEquals(res, new Solution().isSubsequence(s1, s2));
    }
}