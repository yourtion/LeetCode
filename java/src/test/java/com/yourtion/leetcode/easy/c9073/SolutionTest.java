package com.yourtion.leetcode.easy.c9073;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 65. 不用加减乘除做加法")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, 2, 3),
                arguments(1, 1, 2),
                arguments(9, 1, 10)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void add(int a, int b, int res) {
        System.out.printf("runTest: %d %d , res: %d", a, b, res);
        Assertions.assertEquals(res, new Solution().add(a, b));
    }
}