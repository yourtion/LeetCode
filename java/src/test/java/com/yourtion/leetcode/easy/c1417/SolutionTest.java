package com.yourtion.leetcode.easy.c1417;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1417. 重新格式化字符串")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("a0b1c2", "0a1b2c"),
                arguments("leetcode", ""),
                arguments("1229857369", ""),
                arguments("covid2019", "c0d1i2o9v"),
                arguments("ab123", "1a2b3"),
                arguments("abc12", "a1b2c")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reformat(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().reformat(source));
    }
}