package com.yourtion.leetcode.easy.c9048;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题15. 二进制中1的个数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("00000000000000000000000000001011", 3),
                arguments("00000000000000000000000010000000", 1),
                arguments("11111111111111111111111111111101", 31),
                arguments("11111111111111111111011101111101", 29),
                arguments("10000000000000000000000000000000", 1)

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void hammingWeight(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int n = Integer.parseUnsignedInt(source, 2);
        Assertions.assertEquals(res, new Solution().hammingWeight(n));
    }
}