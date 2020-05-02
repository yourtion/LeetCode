package com.yourtion.leetcode.daily.m03.d20;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200320")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,2,1]", 2, "[1, 2]"),
                arguments("[0,1,2,1]", 1, "[0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void getLeastNumbers(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s ", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().getLeastNumbers(ss, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}