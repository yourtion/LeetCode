package com.yourtion.leetcode.daily.m11.d10;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201110")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3]", "[1, 3, 2]"),
                arguments("[3,2,1]", "[1, 2, 3]"),
                arguments("[1,1,5]", "[1, 5, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void nextPermutation(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().nextPermutation(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }
}