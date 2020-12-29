package com.yourtion.leetcode.daily.m12.d29;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201229")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3]", 6, 1),
                arguments("[1,5,10]", 20, 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minPatches(String source, int n, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, n, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minPatches(ss, n));
    }
}