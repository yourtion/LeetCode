package com.yourtion.leetcode.daily.m04.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200417")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,3,1,1,4]", true),
                arguments("[3,2,1,0,4]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canJump(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().canJump(ss));
    }
}