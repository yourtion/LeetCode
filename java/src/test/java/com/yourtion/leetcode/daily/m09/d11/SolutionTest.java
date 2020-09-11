package com.yourtion.leetcode.daily.m09.d11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200911")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, 7, "[[1, 2, 4]]"),
                arguments(3, 9, "[[1, 2, 6], [1, 3, 5], [2, 3, 4]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void combinationSum3(int k, int n, String res) {
        System.out.printf("runTest: %d %d , res: %s", k, n, res);
        List<List<Integer>> ret = new Solution().combinationSum3(k, n);
        Assertions.assertEquals(res, ret.toString());
    }
}