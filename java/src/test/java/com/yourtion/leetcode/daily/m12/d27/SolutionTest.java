package com.yourtion.leetcode.daily.m12.d27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201227")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("egg", "add", true),
                arguments("foo", "bar", false),
                arguments("paper", "title", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isIsomorphic(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", s1, s2, res);
        Assertions.assertEquals(res, new Solution().isIsomorphic(s1, s2));
    }
}