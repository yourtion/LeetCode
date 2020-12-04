package com.yourtion.leetcode.daily.m12.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201204")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,3,4,5]", true),
                arguments("[1,2,3,3,4,4,5,5]", true),
                arguments("[1,2,3,4,4,5]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isPossible(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().isPossible(ss));
    }
}