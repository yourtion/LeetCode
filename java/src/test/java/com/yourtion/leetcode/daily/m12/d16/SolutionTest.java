package com.yourtion.leetcode.daily.m12.d16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201216")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abba", "dog cat cat dog", true),
                arguments("abba", "dog cat cat fish", false),
                arguments("aaaa", "dog cat cat dog", false),
                arguments("abba", "dog dog dog dog", false),
                arguments("aaaa", "dog dog dog dog", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void wordPattern(String pattern, String str, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", pattern, str, res);
        Assertions.assertEquals(res, new Solution().wordPattern(pattern, str));
    }
}