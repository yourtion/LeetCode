package com.yourtion.leetcode.daily.m12.d24;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201223")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,0,2]", 5),
                arguments("[1,2,2]", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void candy(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().candy(ss));
    }
}