package com.yourtion.leetcode.daily.m08.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200806")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"abcd", "dcba", "lls", "s", "sssll"}, "[[0, 1],[1, 0],[3, 2],[2, 4]]"),
                arguments(new String[]{"bat", "tab", "cat"}, "[[0, 1],[1, 0]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void palindromePairs(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s", Arrays.toString(source), res);
        List<List<Integer>> ret = new Solution().palindromePairs(source);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}