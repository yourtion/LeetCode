package com.yourtion.leetcode.daily.m05.d24;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200524")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3]", "[2]", 2.0),
                arguments("[1, 2]", "[3, 4]", 2.5)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findMedianSortedArrays(String n1, String n2, double res) {
        System.out.printf("runTest: %s %s , res: %f", n1, n2, res);
        int[] n1a = TestUtils.stringToIntegerArray(n1);
        int[] n2a = TestUtils.stringToIntegerArray(n2);
        Assertions.assertEquals(res, new Solution().findMedianSortedArrays(n1a, n2a));
    }
}