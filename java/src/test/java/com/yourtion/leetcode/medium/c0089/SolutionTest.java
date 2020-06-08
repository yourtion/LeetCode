package com.yourtion.leetcode.medium.c0089;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("89. 格雷编码")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, "[0, 1, 3, 2]"),
                arguments(0, "[0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void grayCode(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        List<Integer> ret = new Solution().grayCode(source);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}