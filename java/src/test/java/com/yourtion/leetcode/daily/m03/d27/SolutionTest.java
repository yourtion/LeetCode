package com.yourtion.leetcode.daily.m03.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200327")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,4,3,2,1]", true),
                arguments("[1,1,1,2,2,2,3,3]", false),
                arguments("[1]", false),
                arguments("[1,1]", true),
                arguments("[1,1,2,2,2,2]", true),
                arguments("[1,1,1,1,2,2,2,2,2,2]", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void hasGroupsSizeX(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().hasGroupsSizeX(ss));
    }
}