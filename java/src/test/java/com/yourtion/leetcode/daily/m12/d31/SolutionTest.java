package com.yourtion.leetcode.daily.m12.d31;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201231")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,2],[2,3],[3,4],[1,3]]", 1),
                arguments("[[1,2],[1,2],[1,2]]", 2),
                arguments("[[1,2], [2,3]]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void eraseOverlapIntervals(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().eraseOverlapIntervals(ss));
    }
}