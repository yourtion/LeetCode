package com.yourtion.leetcode.daily.m06.d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200602")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, 6),
                arguments(9, 45)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sumNums(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().sumNums(source));
    }
}