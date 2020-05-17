package com.yourtion.leetcode.daily.m05.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200517")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, "[[1,0]]", "[0, 1]"),
                arguments(4, "[[1,0],[2,0],[3,1],[3,2]]", "[0, 1, 2, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findOrder(int k, String source, String res) {
        System.out.printf("runTest: %d %s , res: %s", k, source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[] ret = new Solution().findOrder(k, ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}