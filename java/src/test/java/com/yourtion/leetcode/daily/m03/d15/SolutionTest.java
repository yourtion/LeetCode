package com.yourtion.leetcode.daily.m03.d15;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200315")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[0,0,1,0,0,0,0,1,0,0,0,0,0]," +
                        " [0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                        " [0,1,1,0,1,0,0,0,0,0,0,0,0]," +
                        " [0,1,0,0,1,1,0,0,1,0,1,0,0]," +
                        " [0,1,0,0,1,1,0,0,1,1,1,0,0]," +
                        " [0,0,0,0,0,0,0,0,0,0,1,0,0]," +
                        " [0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                        " [0,0,0,0,0,0,0,1,1,0,0,0,0]]", 6),
                arguments("[[0,0,0,0,0,0,0,0]]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxAreaOfIsland(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().maxAreaOfIsland(ss));
    }
}