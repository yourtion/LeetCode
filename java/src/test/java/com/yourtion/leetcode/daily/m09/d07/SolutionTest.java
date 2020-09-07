package com.yourtion.leetcode.daily.m09.d07;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200907")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,1,1,2,2,3]", 2, "[2, 1]"),
                arguments("[1]", 1, "[1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void topKFrequent(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().topKFrequent(ss, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}