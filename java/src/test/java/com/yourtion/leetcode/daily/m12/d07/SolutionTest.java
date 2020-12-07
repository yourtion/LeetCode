package com.yourtion.leetcode.daily.m12.d07;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201207")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[0,0,1,1],[1,0,1,0],[1,1,0,0]]", 39)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void matrixScore(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().matrixScore(ss));
    }
}