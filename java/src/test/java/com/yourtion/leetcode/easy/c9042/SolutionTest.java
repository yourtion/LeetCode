package com.yourtion.leetcode.easy.c9042;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题05. 替换空格")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("We are happy.", "We%20are%20happy.")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void replaceSpace(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().replaceSpace(source));
    }
}