package com.yourtion.leetcode.daily.m08.d13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200813")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("2", "3", "6"),
                arguments("123", "456", "56088")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void multiply(String s1, String s2, String res) {
        System.out.printf("runTest: %s %s, res: %s", s1, s2, res);
        Assertions.assertEquals(res, new Solution().multiply(s1, s2));
    }
}