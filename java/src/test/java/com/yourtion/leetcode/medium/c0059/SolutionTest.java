package com.yourtion.leetcode.medium.c0059;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("59. 螺旋矩阵 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, "[[1, 2, 3],[8, 9, 4],[7, 6, 5]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void generateMatrix(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        int[][] ret = new Solution().generateMatrix(source);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }

}