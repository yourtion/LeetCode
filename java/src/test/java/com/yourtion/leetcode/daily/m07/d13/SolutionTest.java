package com.yourtion.leetcode.daily.m07.d13;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.easy.c0350.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200713")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,2,1]", "[2,2]", "[2,2]"),
                arguments("[4,9,5]", "[9,4,9,8,4]", "[9,4]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void intersect(String n1, String n2, String res) {
        System.out.printf("runTest: %s %s, res: %s", n1, n2, res);
        int[] s1 = TestUtils.stringToIntegerArray(n1);
        int[] s2 = TestUtils.stringToIntegerArray(n2);
        int[] r = TestUtils.stringToIntegerArray(res);
        Assertions.assertArrayEquals(r, new Solution().intersect(s1, s2));
    }
}