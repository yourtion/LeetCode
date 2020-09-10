package com.yourtion.leetcode.daily.m09.d10;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200910")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[10,1,2,7,6,1,5]", 8, "[[1, 1, 6],[1, 2, 5],[1, 7],[2, 6]]"),
                arguments("[2,5,2,1,2]", 5, "[[1, 2, 2],[5]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void combinationSum(String source, int target, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().combinationSum2(ss, target);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}