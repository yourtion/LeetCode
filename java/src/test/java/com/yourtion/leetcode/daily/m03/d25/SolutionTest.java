package com.yourtion.leetcode.daily.m03.d25;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200325")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[2]]", 10),
                arguments("[[1,2],[3,4]]", 34),
                arguments("[[1,0],[0,2]]", 16),
                arguments("[[1,1,1],[1,0,1],[1,1,1]]", 32),
                arguments("[[2,2,2],[2,1,2],[2,2,2]]", 46)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void surfaceArea(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().surfaceArea(ss));
    }
}