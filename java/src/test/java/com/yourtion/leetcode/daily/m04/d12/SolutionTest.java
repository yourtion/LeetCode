package com.yourtion.leetcode.daily.m04.d12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200412")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new int[]{0, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, -1}, new double[]{0.5, 0}),
                arguments(new int[]{0, 0}, new int[]{3, 3}, new int[]{1, 1}, new int[]{2, 2}, new double[]{1, 1}),
                arguments(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{2, 1}, new double[]{})
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void intersection(int[] start1, int[] end1, int[] start2, int[] end2, double[] res) {
        System.out.printf("runTest: %s %s  %s %s , res: %s ",
                Arrays.toString(start1), Arrays.toString(end1),
                Arrays.toString(start2), Arrays.toString(end2),
                Arrays.toString(res)
        );
        Assertions.assertArrayEquals(res, new Solution().intersection(start1, end1, start2, end2));
    }
}