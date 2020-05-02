package com.yourtion.leetcode.daily.m03.d31;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200331")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,2,3,1]", "[1, 2, 3, 5]"),
                arguments("[5,1,1,2,0,0]", "[0, 0, 1, 1, 2, 5]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortArray(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().sortArray(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}