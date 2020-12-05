package com.yourtion.leetcode.daily.m12.d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201205")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2, 8),
                arguments(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0, 6)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void leastInterval(char[] tasks, int n, int res) {
        System.out.printf("runTest: %s %d , res: %d", Arrays.toString(tasks), n, res);
        Assertions.assertEquals(res, new Solution().leastInterval(tasks, n));
    }
}