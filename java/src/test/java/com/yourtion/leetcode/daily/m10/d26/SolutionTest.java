package com.yourtion.leetcode.daily.m10.d26;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201026")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[8,1,2,2,3]", "[4, 0, 1, 1, 3]"),
                arguments("[6,5,4,8]", "[2, 1, 0, 3]"),
                arguments("[7,7,7,7]", "[0, 0, 0, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void smallerNumbersThanCurrent(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().smallerNumbersThanCurrent(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}