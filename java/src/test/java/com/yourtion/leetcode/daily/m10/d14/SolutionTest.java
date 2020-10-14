package com.yourtion.leetcode.daily.m10.d14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201014")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"bella", "label", "roller"}, "[e, l, l]"),
                arguments(new String[]{"cool", "lock", "cook"}, "[c, o]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void commonChars(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s", Arrays.toString(source), res);
        List<String> ret = new Solution().commonChars(source);
        Assertions.assertEquals(res, Arrays.toString(ret.toArray()));
    }
}