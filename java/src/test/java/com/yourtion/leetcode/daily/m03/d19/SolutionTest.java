package com.yourtion.leetcode.daily.m03.d19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200319")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abccccdd", 7),
                arguments("abcccCdd", 5),
                arguments("aabcdefh", 3),
                arguments("abcdef", 1),
                arguments("aabcdefhh", 5),
                arguments("", 0),
                arguments("bb", 2),
                arguments("ccc", 3),
                arguments("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez", 55)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void longestPalindrome(String source, int res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        Assertions.assertEquals(res, new Solution().longestPalindrome(source));
    }
}