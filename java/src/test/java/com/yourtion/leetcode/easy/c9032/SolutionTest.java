package com.yourtion.leetcode.easy.c9032;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 16.07. 最大数值")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, 2, 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maximum(int a, int b, int res) {
        System.out.printf("runTest: %d %d , res: %d", a, b, res);
        Assertions.assertEquals(res, new Solution().maximum(a, b));
    }
}