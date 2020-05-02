package com.yourtion.leetcode.daily.m04.d06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200406")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("horse", "ros", 3),
                arguments("intention", "execution", 5)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minDistance(String w1, String w2, int res) {
        System.out.printf("runTest: %s %s , res: %d ", w1, w2, res);
        Assertions.assertEquals(res, new Solution().minDistance(w1, w2));
    }
}