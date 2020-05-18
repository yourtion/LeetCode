package com.yourtion.leetcode.easy.c1446;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1446. 连续字符")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("leetcode", 2),
                arguments("abbcccddddeeeeedcba", 5),
                arguments("triplepillooooow", 5),
                arguments("hooraaaaaaaaaaay", 11),
                arguments("tourist", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxPower(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().maxPower(source));
    }
}