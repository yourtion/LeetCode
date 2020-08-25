package com.yourtion.leetcode.daily.m08.d25;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200825")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4, 6, 7, 7]", "[[4, 6, 7, 7],[4, 6, 7],[4, 6],[4, 7, 7],[4, 7],[6, 7, 7],[6, 7],[7, 7]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findSubsequences(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().findSubsequences(ss);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}