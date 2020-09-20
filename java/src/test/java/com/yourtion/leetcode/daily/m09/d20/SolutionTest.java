package com.yourtion.leetcode.daily.m09.d20;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200920")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3]", "[[],[1],[1, 2],[1, 2, 3],[1, 3],[2],[2, 3],[3]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void subsets(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().subsets(ss);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}