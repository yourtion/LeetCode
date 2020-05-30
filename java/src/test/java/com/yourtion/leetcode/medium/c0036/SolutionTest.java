package com.yourtion.leetcode.medium.c0036;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("36. 有效的数独")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[\n" +
                        "  [\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"],\n" +
                        "  [\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"],\n" +
                        "  [\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"],\n" +
                        "  [\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"],\n" +
                        "  [\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"],\n" +
                        "  [\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"],\n" +
                        "  [\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"],\n" +
                        "  [\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"],\n" +
                        "  [\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]\n" +
                        "]", true),
                arguments("[\n" +
                        "  [\"8\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"],\n" +
                        "  [\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"],\n" +
                        "  [\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"],\n" +
                        "  [\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"],\n" +
                        "  [\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"],\n" +
                        "  [\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"],\n" +
                        "  [\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"],\n" +
                        "  [\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"],\n" +
                        "  [\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]\n" +
                        "]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isValidSudoku(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        char[][] ss = TestUtils.stringToChar2dArray(source);
        Assertions.assertEquals(res, new Solution().isValidSudoku(ss));
    }
}