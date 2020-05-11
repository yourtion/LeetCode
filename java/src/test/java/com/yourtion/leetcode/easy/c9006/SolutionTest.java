package com.yourtion.leetcode.easy.c9006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 01.01. 判定字符是否唯一")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("leetcode", false),
                arguments("abc", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isUnique(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().isUnique(source));
    }
}