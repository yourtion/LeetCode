package com.yourtion.leetcode.medium.c0063;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("63. 不同路径 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[0,0,0],[0,1,0],[0,0,0]]", 2),
                arguments("[[1]]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void uniquePaths(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().uniquePathsWithObstacles(ss));
    }
}