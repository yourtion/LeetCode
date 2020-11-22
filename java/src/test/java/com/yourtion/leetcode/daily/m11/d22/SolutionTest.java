package com.yourtion.leetcode.daily.m11.d22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201122")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("rat", "car", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isAnagram(String s, String t, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", s, t, res);
        Assertions.assertEquals(res, new Solution().isAnagram(s, t));
    }
}