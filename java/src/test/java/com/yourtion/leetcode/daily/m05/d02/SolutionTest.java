package com.yourtion.leetcode.daily.m05.d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200502")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abcabcbb", 3),
                arguments("bbbbb", 1),
                arguments("pwwkew", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void lengthOfLongestSubstring(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().lengthOfLongestSubstring(source));
    }
}