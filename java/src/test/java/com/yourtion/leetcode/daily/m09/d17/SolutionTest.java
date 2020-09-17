package com.yourtion.leetcode.daily.m09.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200917")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,2], [1,3], [2,3]]", "[2, 3]"),
                arguments("[[1,2], [2,3], [3,4], [4,1], [1,5]]", "[4, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findRedundantDirectedConnection(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[] ret = new Solution().findRedundantDirectedConnection(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}