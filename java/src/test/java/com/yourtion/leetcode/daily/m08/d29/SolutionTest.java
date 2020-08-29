package com.yourtion.leetcode.daily.m08.d29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200829")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aacecaaa", "aaacecaaa"),
                arguments("abcd", "dcbabcd")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void shortestPalindrome(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().shortestPalindrome(source));
    }
}