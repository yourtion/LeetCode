package com.yourtion.leetcode.medium.c0079;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("79. 单词搜索")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        return Stream.of(
                arguments(board, "ABCCED", true),
                arguments(board, "SEE", true),
                arguments(board, "ABCB", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void exist(char[][] board, String word, boolean res) {
        System.out.printf("runTest: %s  %s , res: %b", Arrays.deepToString(board), word, res);
        Assertions.assertEquals(res, new Solution().exist(board, word));
    }
}