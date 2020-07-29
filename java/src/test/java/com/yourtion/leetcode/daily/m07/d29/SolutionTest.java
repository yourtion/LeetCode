package com.yourtion.leetcode.daily.m07.d29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200728")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"S#O", "M..", "M.T"}, 16),
                arguments(new String[]{"S#O", "M.#", "M.T"}, -1),
                arguments(new String[]{"S#O", "M.T", "M.."}, 17)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minimalSteps(String[] source, int res) {
        System.out.printf("runTest: %s , res: %d", Arrays.toString(source), res);
        Assertions.assertEquals(res, new Solution().minimalSteps(source));
    }
}