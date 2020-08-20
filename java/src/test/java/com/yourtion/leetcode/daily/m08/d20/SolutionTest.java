package com.yourtion.leetcode.daily.m08.d20;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200820")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[\"E\", \"E\", \"E\", \"E\", \"E\"],[\"E\", \"E\", \"M\", \"E\", \"E\"],[\"E\", \"E\", \"E\", \"E\", \"E\"],[\"E\", \"E\", \"E\", \"E\", \"E\"]]",
                        "[3,0]",
                        "[[B, 1, E, 1, B], [B, 1, M, 1, B], [B, 1, 1, 1, B], [B, B, B, B, B]]"
                )
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void updateBoard(String source, String click, String res) {
        System.out.printf("runTest: %s %s , res: %s", source, click, res);
        char[][] chars = TestUtils.stringToChar2dArray(source);
        int[] ss = TestUtils.stringToIntegerArray(click);
        char[][] ret = new Solution().updateBoard(chars, ss);
        Assertions.assertEquals(res, Arrays.deepToString(ret));
    }
}