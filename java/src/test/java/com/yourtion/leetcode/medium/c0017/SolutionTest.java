package com.yourtion.leetcode.medium.c0017;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("17. 电话号码的字母组合")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("23", "[ad, ae, af, bd, be, bf, cd, ce, cf]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void letterCombinations(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<String> ret = new Solution().letterCombinations(source);
        Assertions.assertEquals(res, ret.toString());
    }
}