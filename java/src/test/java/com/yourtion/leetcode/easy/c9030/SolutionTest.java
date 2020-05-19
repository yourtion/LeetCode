package com.yourtion.leetcode.easy.c9030;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 10.05. 稀疏数组搜索")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}, "ta", -1),
                arguments(new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}, "ball", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findString(String[] source, String s, int res) {
        System.out.printf("runTest: %s %s  , res: %d", Arrays.toString(source), s, res);
        Assertions.assertEquals(res, new Solution().findString(source, s));
    }
}