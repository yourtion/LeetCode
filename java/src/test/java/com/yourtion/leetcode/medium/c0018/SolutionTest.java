package com.yourtion.leetcode.medium.c0018;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("18. 四数之和")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 0, -1, 0, -2, 2]", 0, "[[-2, -1, 1, 2],[-2, 0, 0, 2],[-1, 0, 0, 1]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void fourSum(String source, int target, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().fourSum(ss, target);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}