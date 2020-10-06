package com.yourtion.leetcode.daily.m10.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201006")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(6, "[[0,1],[0,2],[2,3],[2,4],[2,5]]", "[8, 12, 6, 10, 10, 10]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sumOfDistancesInTree(int n, String source, String res) {
        System.out.printf("runTest: %d %s , res: %s", n, source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[] ret = new Solution().sumOfDistancesInTree(n, ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}