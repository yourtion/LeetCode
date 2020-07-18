package com.yourtion.leetcode.daily.m07.d18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200718")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aabcc", "dbbca", "aadbbcbcac", true),
                arguments("aabcc", "dbbca", "aadbbbaccc", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isInterleave(String s1, String s2, String s3, boolean res) {
        System.out.printf("runTest: %s %s %s , res: %b", s1, s2, s3, res);
        Assertions.assertEquals(res, new Solution().isInterleave(s1, s2, s3));
    }
}