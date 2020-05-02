package com.yourtion.leetcode.daily.m04.d23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200423")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(5, 2),
                arguments(10, 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void waysToChange(int source, int res) {
        System.out.printf("runTest: %d , res: %d ", source, res);
        Assertions.assertEquals(res, new Solution().waysToChange(source));
    }
}