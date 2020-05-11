package com.yourtion.leetcode.easy.c9008;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 01.03. URL化")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("Mr John Smith    ", 13, "Mr%20John%20Smith"),
                arguments("               ", 5, "%20%20%20%20%20"),
                arguments("ds sdfs afs sdfa dfssf asdf             ", 27, "ds%20sdfs%20afs%20sdfa%20dfssf%20asdf")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void replaceSpaces(String source, int l, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, l, res);
        Assertions.assertEquals(res, new Solution().replaceSpaces(source, l));
    }
}