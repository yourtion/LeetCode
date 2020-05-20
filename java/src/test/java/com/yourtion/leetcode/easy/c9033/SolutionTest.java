package com.yourtion.leetcode.easy.c9033;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 16.11. 跳水板")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, 2, 3, "[3, 4, 5, 6]"),
                arguments(1, 1, 0, "[]"),
                arguments(1, 1, 100000, "[100000]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void divingBoard(int s, int l, int k, String res) {
        System.out.printf("runTest: %d %d %d , res: %s", s, l, k, res);
        int[] ret = new Solution().divingBoard(s, l, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}