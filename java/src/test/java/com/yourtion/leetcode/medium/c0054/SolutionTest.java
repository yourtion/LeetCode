package com.yourtion.leetcode.medium.c0054;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("54. 螺旋矩阵")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[ [ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]", "[1, 2, 3, 6, 9, 8, 7, 4, 5]"),
                arguments("[[1, 2, 3, 4],[5, 6, 7, 8],[9,10,11,12]]", "[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void spiralOrder(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        List<Integer> ret = new Solution().spiralOrder(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}