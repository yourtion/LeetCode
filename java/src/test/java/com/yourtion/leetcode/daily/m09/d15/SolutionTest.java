package com.yourtion.leetcode.daily.m09.d15;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200915")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[" +
                        "[\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"]," +
                        "[\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"]," +
                        "[\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"]," +
                        "[\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"]," +
                        "[\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"]," +
                        "[\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"]," +
                        "[\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"]," +
                        "[\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"]," +
                        "[\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]" +
                        "]", "[" +
                        "[5, 3, 4, 6, 7, 8, 9, 1, 2], " +
                        "[6, 7, 2, 1, 9, 5, 3, 4, 8], " +
                        "[1, 9, 8, 3, 4, 2, 5, 6, 7], " +
                        "[8, 5, 9, 7, 6, 1, 4, 2, 3], " +
                        "[4, 2, 6, 8, 5, 3, 7, 9, 1], " +
                        "[7, 1, 3, 9, 2, 4, 8, 5, 6], " +
                        "[9, 6, 1, 5, 3, 7, 2, 8, 4], " +
                        "[2, 8, 7, 4, 1, 9, 6, 3, 5], " +
                        "[3, 4, 5, 2, 8, 6, 1, 7, 9]" +
                        "]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void solveSudoku(String source, String res) {
        System.out.printf("runTest: %s ,\n res: %s", source, res);
        char[][] chars = TestUtils.stringToChar2dArray(source);
        new Solution().solveSudoku(chars);
        Assertions.assertEquals(res, Arrays.deepToString(chars));
    }
}