package com.yourtion.leetcode.medium.c0071;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("71. 简化路径")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("/home/", "/home"),
                arguments("/../", "/"),
                arguments("/home//foo/", "/home/foo"),
                arguments("/a/./b/../../c/", "/c"),
                arguments("/a/../../b/../c//.//", "/c"),
                arguments("/a//b////c/d//././/..", "/a/b/c")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void simplifyPath(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().simplifyPath(source));
    }
}