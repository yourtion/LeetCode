package com.yourtion.leetcode.daily.m11.d14;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201114")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,3,1,3,2,4,6,7,9,2,19]", "[2,1,4,3,9,6]",
                        "[2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]"),
                arguments("[2,3,1,3,2,4,6,7,9,2,19,0,22]", "[2,1,4,3,9,6]",
                        "[2, 2, 2, 1, 4, 3, 3, 9, 6, 0, 7, 19, 22]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void relativeSortArray(String a1, String a2, String res) {
        System.out.printf("runTest: %s %s , res: %s", a1, a2, res);
        int[] s1 = TestUtils.stringToIntegerArray(a1);
        int[] s2 = TestUtils.stringToIntegerArray(a2);
        int[] ret = new Solution().relativeSortArray(s1, s2);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}