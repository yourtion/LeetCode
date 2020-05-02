package com.yourtion.leetcode.daily.m03.d14;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200314")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[10,9,2,5,3,7,101,18]", 4),
                arguments("[1,2,3,4,5]", 5),
                arguments("[5,4,3,2,1]", 1),
                arguments("[1]", 1),
                arguments("[]", 0),
                arguments("[10,9,2,5,3,4]", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void lengthOfLIS(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().lengthOfLIS(ss));
    }
}