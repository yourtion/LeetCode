package com.yourtion.leetcode.daily.m06.d11;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200611")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[73, 74, 75, 71, 69, 72, 76, 73]", "[1, 1, 4, 2, 1, 1, 0, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void dailyTemperatures(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().dailyTemperatures(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}