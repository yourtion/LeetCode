package com.yourtion.leetcode.medium.c0006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("6. Z 字形变换")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("LEETCODEISHIRING", 3, "LCIRETOESIIGEDHN"),
                arguments("LEETCODEISHIRING", 4, "LDREOEIIECIHNTSG")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void convert(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        Assertions.assertEquals(res, new Solution().convert(source, k));
    }
}