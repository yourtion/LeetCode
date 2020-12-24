package com.yourtion.leetcode.easy.c9068;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("SolutionTest")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,7,11,15]", 9, "[2, 7]"),
                arguments("[10,26,30,31,47,60]", 40, "[10, 30]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void twoSum(String source, int s, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, s, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().twoSum(ss, s);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}