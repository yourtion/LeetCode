package com.yourtion.leetcode.daily.m12.d15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201215")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(10, 9),
                arguments(1234, 1234),
                arguments(332, 299)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void monotoneIncreasingDigits(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().monotoneIncreasingDigits(source));
    }
}