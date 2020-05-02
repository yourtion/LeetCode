package com.yourtion.leetcode.daily.m03.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200328")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("time,me,bell", 10),
                arguments("time,time,me,be,bell", 13)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minimumLengthEncoding(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().minimumLengthEncoding(ss));
    }
}