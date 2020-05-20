package com.yourtion.leetcode.easy.c9034;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 16.15. 珠玑妙算")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("RGBY", "GGRR", "[1, 1]"),
                arguments("RGBY", "RGBY", "[4, 0]")

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void masterMind(String s, String g, String res) {
        System.out.printf("runTest: %s %s , res: %s", s, g, res);
        int[] ret = new Solution().masterMind(s, g);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}