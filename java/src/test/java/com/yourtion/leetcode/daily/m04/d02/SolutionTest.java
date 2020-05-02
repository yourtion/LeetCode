package com.yourtion.leetcode.daily.m04.d02;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200402")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[0,1,0],[0,0,1],[1,1,1],[0,0,0]]", "[[0, 0, 0],[1, 0, 1],[0, 1, 1],[0, 1, 0]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void gameOfLife(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        new Solution().gameOfLife(ss);
        String ret = TestUtils.int2dArrayToString(ss);
        Assertions.assertEquals(res, ret);
    }
}