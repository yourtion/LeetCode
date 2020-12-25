package com.yourtion.leetcode.daily.m12.d25;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.easy.c0455.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201225")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2]", "[1,2,3]", 2),
                arguments("[1,2,3]", "[1,1]", 1),
                arguments("[1,2,2]", "[1,2,3]", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findContentChildren(String g, String s, int res) {
        System.out.printf("runTest: %s %s , res: %d", g, s, res);
        int[] gg = TestUtils.stringToIntegerArray(g);
        int[] ss = TestUtils.stringToIntegerArray(s);
        Assertions.assertEquals(res, new Solution().findContentChildren(gg, ss));
    }
}