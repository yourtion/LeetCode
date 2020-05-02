package com.yourtion.leetcode.daily.m03.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200304")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[2,1,1],[1,1,0],[0,1,1]]", 4),
                arguments("[[2,1,1],[0,1,1],[1,0,1]]", -1),
                arguments("[[0,2]]", 0),
                arguments("[[1,2]]", 1),
                arguments("[[1],[2],[2]]", 1),
                arguments("[[1],[1],[1],[1]]", -1),
                arguments("[[2],[2],[1],[0],[1],[1]]", -1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void orangesRotting(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().orangesRotting(ss));
    }
}