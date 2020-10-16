package com.yourtion.leetcode.daily.m10.d16;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201016")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[-4,-1,0,3,10]", "[0, 1, 9, 16, 100]"),
                arguments("[-7,-3,2,3,11]", "[4, 9, 9, 49, 121]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortedSquares(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().sortedSquares(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}