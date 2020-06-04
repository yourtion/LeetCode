package com.yourtion.leetcode.medium.c0074;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("74. 搜索二维矩阵")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,   3,  5,  7],[10, 11, 16, 20],[23, 30, 34, 50]]", 3, true),
                arguments("[[1,   3,  5,  7],[10, 11, 16, 20],[23, 30, 34, 50]]", 13, false),
                arguments("[[]]", 1, false),
                arguments("[[1]]", 1, true),
                arguments("[[1,3]]", 3, true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void searchMatrix(String source, int target, boolean res) {
        System.out.printf("runTest: %s %d , res: %b", source, target, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().searchMatrix(ss, target));
    }
}