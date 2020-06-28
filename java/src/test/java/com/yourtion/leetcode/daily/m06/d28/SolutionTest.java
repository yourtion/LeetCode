package com.yourtion.leetcode.daily.m06.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200627")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,3,1,2,4,3]", 7, 2),
                arguments("[2,3,1,1,1,1,1]", 5, 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minSubArrayLen(String source, int s, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, s, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minSubArrayLen(s, ss));
    }
}