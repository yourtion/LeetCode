package com.yourtion.leetcode.daily.m08.d16;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200816")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[0,0,0],[0,1,1]]", 1, 1, 1, "[[0, 0, 0],[0, 1, 1]]"),
                arguments("[[1,1,1],[1,1,0],[1,0,1]]", 1, 1, 2, "[[2, 2, 2],[2, 2, 0],[2, 0, 1]]"),
                arguments("[[1,1,1],[1,3,0],[1,3,1]]", 2, 2, 3, "[[1, 1, 1],[1, 3, 0],[1, 3, 3]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void floodFill(String source, int sr, int sc, int newColor, String res) {
        System.out.printf("runTest: %s %d %d %d, res: %s ", source, sr, sc, newColor, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().floodFill(ss, sr, sc, newColor);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }
}