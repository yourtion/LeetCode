package com.yourtion.leetcode.daily.m08.d09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200809")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("25525511135", "[255.255.11.135, 255.255.111.35]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void restoreIpAddresses(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<String> ret = new Solution().restoreIpAddresses(source);
        Assertions.assertEquals(res, ret.toString());
    }
}