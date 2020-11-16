package com.yourtion.leetcode.daily.m11.d16;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201116")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]", "[[5, 0],[7, 0],[5, 2],[6, 1],[4, 4],[7, 1]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reconstructQueue(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().reconstructQueue(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }
}