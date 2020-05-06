package com.yourtion.leetcode.easy.c1408;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1408. 数组中的字符串匹配")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"mass", "as", "hero", "superhero"}, "[as, hero]"),
                arguments(new String[]{"leetcode", "et", "code"}, "[et, code]"),
                arguments(new String[]{"blue", "green", "bu"}, "[]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void stringMatching(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s", Arrays.toString(source), res);
        List<String> ret = new Solution().stringMatching(source);
        Assertions.assertEquals(res, ret.toString());
    }
}