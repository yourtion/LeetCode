package com.yourtion.leetcode.daily.m07.d26;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200726")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[9,9,4],[6,6,8],[2,1,1]]", 4),
                arguments("[[3,4,5],[3,2,6],[2,2,1]]", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void longestIncreasingPath(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().longestIncreasingPath(ss));
    }
}