package com.yourtion.leetcode.daily.m12.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201217")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 3, 2, 8, 4, 9]", 2, 8)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxProfit(String source, int fee, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, fee, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxProfit(ss, fee));
    }
}