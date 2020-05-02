package com.yourtion.leetcode.daily.m04.d11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200411")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, 2, 2),
                arguments(2, 6, 3),
                arguments(3, 14, 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void superEggDrop(int k, int n, int res) {
        System.out.printf("runTest: %d %d, res: %d ", k, n, res);
        Assertions.assertEquals(res, new Solution().superEggDrop(k, n));
    }
}