package com.yourtion.leetcode.daily.m10.d07;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201007")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,0,2,1,1,0]", "[0, 0, 1, 1, 2, 2]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortColors(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().sortColors(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }
}