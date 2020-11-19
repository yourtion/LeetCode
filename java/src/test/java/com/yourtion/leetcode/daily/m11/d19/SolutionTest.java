package com.yourtion.leetcode.daily.m11.d19;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201119")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[0,1,0,3,12]", "[1, 3, 12, 0, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void moveZeroes(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().moveZeroes(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }
}