package com.yourtion.leetcode.daily.m03.d03;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200303")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,0,0,0]", 3, "[2,5,6]", 3, "[1, 2, 2, 3, 5, 6]"),
                arguments("[1,2,3,0,0,0,0]", 3, "[2,5,6,7]", 4, "[1, 2, 2, 3, 5, 6, 7]"));
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void merge(String s1, int m, String s2, int n, String res) {
        System.out.printf("runTest: %s %s %d, res: %s ", s1, s2, n, res);
        int[] s1s = TestUtils.stringToIntegerArray(s1);
        int[] s2s = TestUtils.stringToIntegerArray(s2);
        new Solution().merge(s1s, m, s2s, n);
        String ret = TestUtils.integerArrayToString(s1s);
        Assertions.assertEquals(res, ret);
    }
}