package com.yourtion.leetcode.easy.c9072;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 61. 扑克牌中的顺子")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", true),
                arguments("[0,0,1,2,5]", true),
                arguments("[0,12,11,11,0]", false),
                arguments("[1,2,12,0,3]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isStraight(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().isStraight(ss));
    }
}