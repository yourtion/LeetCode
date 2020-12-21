package com.yourtion.leetcode.daily.m12.d21;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201220")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[10, 15, 20]", 15),
                arguments("[1, 100, 1, 1, 1, 100, 1, 1, 100, 1]", 6)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minCostClimbingStairs(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minCostClimbingStairs(ss));
    }
}