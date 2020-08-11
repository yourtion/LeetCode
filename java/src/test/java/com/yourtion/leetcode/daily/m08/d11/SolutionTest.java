package com.yourtion.leetcode.daily.m08.d11;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200811")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"O\",\"X\"],[\"X\",\"X\",\"O\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]]",
                        "[[X, X, X, X], [X, X, X, X], [X, X, X, X], [X, O, X, X]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void solve(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        char[][] chars = TestUtils.stringToChar2dArray(source);
        new Solution().solve(chars);
        Assertions.assertEquals(res, Arrays.deepToString(chars));
    }
}