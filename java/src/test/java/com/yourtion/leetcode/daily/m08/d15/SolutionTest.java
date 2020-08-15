package com.yourtion.leetcode.daily.m08.d15;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200815")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3,2,2,2,3,4,3,1]", 23)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void removeBoxes(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().removeBoxes(ss));
    }
}