package com.yourtion.leetcode.daily.m06.d23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200623")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("11", "1", "100"),
                arguments("1010", "1011", "10101"),
                arguments("0", "0", "0"),
                arguments("0", "1", "1")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void addBinary(String source1, String source2, String res) {
        System.out.printf("runTest: %s + %s, res: %s", source1, source2, res);
        Assertions.assertEquals(res, new Solution().addBinary(source1, source2));
    }
}