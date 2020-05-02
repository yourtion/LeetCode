package com.yourtion.leetcode.daily.m03.d24;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200324")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,1]", 4),
                arguments("[2,7,9,3,1]", 12),
                arguments("[2,1,4,5,3,1,1,3]", 12),
                arguments("[]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void massage(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().massage(ss));
    }
}