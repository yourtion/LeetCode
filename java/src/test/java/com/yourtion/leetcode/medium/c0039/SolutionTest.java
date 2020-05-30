package com.yourtion.leetcode.medium.c0039;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("39. 组合总和")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,3,6,7]", 7, "[[2, 2, 3],[7]]"),
                arguments("[2,3,5]", 8, "[[2, 2, 2, 2],[2, 3, 3],[3, 5]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void combinationSum(String source, int target, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().combinationSum(ss, target);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}