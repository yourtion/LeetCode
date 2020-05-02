package com.yourtion.leetcode.daily.m03.d21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200321")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, 5, 4, true),
                arguments(2, 6, 5, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canMeasureWater(int x, int y, int z, boolean res) {
        System.out.printf("runTest: %d %d %d , res: %b ", x, y, z, res);
        Assertions.assertEquals(res, new Solution().canMeasureWater(x, y, z));
    }
}