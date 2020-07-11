package com.yourtion.leetcode.daily.m07.d11;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200711")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,2,6,1]", "[2, 1, 1, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countSmaller(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<Integer> ret = new Solution().countSmaller(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}