package com.yourtion.leetcode.daily.m08.d01;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200801")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]", "[20, 24]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void smallestRange(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<List<Integer>> list = TestUtils.stringToInteger2dArray(source);
        int[] ret = new Solution().smallestRange(list);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}