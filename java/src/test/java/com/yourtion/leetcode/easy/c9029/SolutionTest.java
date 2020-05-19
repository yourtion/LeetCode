package com.yourtion.leetcode.easy.c9029;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 08.10. 颜色填充")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,1,1],[1,1,0],[1,0,1]]", 1, 1, 2, "[[2, 2, 2],[2, 2, 0],[2, 0, 1]]"),
                arguments("[[0,0,0],[0,1,1]]", 1, 1, 1, "[[0, 0, 0],[0, 1, 1]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void floodFill(String source, int r, int c, int color, String res) {
        System.out.printf("runTest: %s %d %d %d, res: %s", source, r, c, color, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        new Solution().floodFill(ss, r, c, color);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ss));
    }
}