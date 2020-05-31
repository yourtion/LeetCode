package com.yourtion.leetcode.medium.c0048;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("48. 旋转图像")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,2,3],[4,5,6],[7,8,9]]", "[[7, 4, 1],[8, 5, 2],[9, 6, 3]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void rotate(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        new Solution().rotate(ss);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ss));
    }
}