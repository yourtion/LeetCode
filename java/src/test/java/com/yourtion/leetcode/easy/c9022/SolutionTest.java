package com.yourtion.leetcode.easy.c9022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 05.06. 整数转换")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(29, 15, 2),
                arguments(1, 2, 2),
                arguments(826966453, -729934991, 14),
                arguments(-784351584, -1488989877, 17)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void convertInteger(int a, int b, int res) {
        System.out.printf("runTest: %d %d , res: %d", a, b, res);
        Assertions.assertEquals(res, new Solution().convertInteger(a, b));
    }
}