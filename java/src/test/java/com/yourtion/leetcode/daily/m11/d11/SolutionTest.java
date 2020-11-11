package com.yourtion.leetcode.daily.m11.d11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201111")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("godding", "gd", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findRotateSteps(String ring, String key, int res) {
        System.out.printf("runTest: %s %s , res: %d", ring, key, res);
        Assertions.assertEquals(res, new Solution().findRotateSteps(ring, key));
    }
}