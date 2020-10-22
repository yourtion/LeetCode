package com.yourtion.leetcode.daily.m10.d22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201022")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("ababcbacadefegdehijhklij", "[9, 7, 8]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void partitionLabels(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<Integer> ret = new Solution().partitionLabels(source);
        Assertions.assertEquals(res, ret.toString());
    }
}