package com.yourtion.leetcode.daily.m05.d23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200523")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("ADOBECODEBANC", "ABC", "BANC")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minWindow(String s, String t, String res) {
        System.out.printf("runTest: %s %s, res: %s", s, t, res);
        Assertions.assertEquals(res, new Solution().minWindow(s, t));
    }
}