package com.yourtion.leetcode.daily.m06.d12;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200612")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[-1, 0, 1, 2, -1, -4]", "[[-1, -1, 2],[-1, 0, 1]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void threeSum(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().threeSum(ss);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}