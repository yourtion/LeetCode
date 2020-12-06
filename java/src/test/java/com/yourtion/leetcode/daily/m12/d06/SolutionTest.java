package com.yourtion.leetcode.daily.m12.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201206")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, "[[1]]"),
                arguments(2, "[[1],[1, 1]]"),
                arguments(3, "[[1],[1, 1],[1, 2, 1]]"),
                arguments(4, "[[1],[1, 1],[1, 2, 1],[1, 3, 3, 1]]"),
                arguments(5, "[[1],[1, 1],[1, 2, 1],[1, 3, 3, 1],[1, 4, 6, 4, 1]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void generate(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        String ret = TestUtils.int2dListToString(new Solution().generate(source));
        Assertions.assertEquals(res, ret);
    }
}