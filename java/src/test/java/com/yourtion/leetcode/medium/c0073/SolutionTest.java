package com.yourtion.leetcode.medium.c0073;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("73. 矩阵置零")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,1,1],[1,0,1],[1,1,1]]", "[[1, 0, 1],[0, 0, 0],[1, 0, 1]]"),
                arguments("[[0,1,2,0],[3,4,5,2],[1,3,1,5]]", "[[0, 0, 0, 0],[0, 4, 5, 0],[0, 3, 1, 0]]"),
                arguments("[[1,1,1],[0,1,2]]", "[[0, 1, 1],[0, 0, 0]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void setZeroes(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        new Solution().setZeroes(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ss));
    }
}