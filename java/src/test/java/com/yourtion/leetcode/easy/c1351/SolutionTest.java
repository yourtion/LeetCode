package com.yourtion.leetcode.easy.c1351;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1351. 统计有序矩阵中的负数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]", 8),
                arguments("[[3,2],[1,0]]", 0),
                arguments("[[1,-1],[-1,-1]]", 3),
                arguments("[[-1]]", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countNegatives(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[][] grid = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().countNegatives(grid));
    }
}