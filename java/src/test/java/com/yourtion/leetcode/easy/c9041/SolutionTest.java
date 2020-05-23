package com.yourtion.leetcode.easy.c9041;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题04. 二维数组中的查找")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        String s = "[" +
                "[1,   4,  7, 11, 15]," +
                "[2,   5,  8, 12, 19]," +
                "[3,   6,  9, 16, 22]," +
                "[10, 13, 14, 17, 24]," +
                "[18, 21, 23, 26, 30]" +
                "]";
        return Stream.of(
                arguments(s, 5, true),
                arguments(s, 20, false),
                arguments("[[]]", 1, false),
                arguments("[[-1,3]]", 3, true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findNumberIn2DArray(String source, int target, boolean res) {
        System.out.printf("runTest: %s %d , res: %b", source, target, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().findNumberIn2DArray(ss, target));
    }
}