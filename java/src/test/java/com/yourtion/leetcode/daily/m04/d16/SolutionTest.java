package com.yourtion.leetcode.daily.m04.d16;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200416")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,3],[2,6],[8,10],[15,18]]", "[[1, 6],[8, 10],[15, 18]]"),
                arguments("[[1,4],[4,5]]", "[[1, 5]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void merge(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().merge(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }
}