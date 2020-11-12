package com.yourtion.leetcode.daily.m11.d12;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201112")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,2,5,7]", "[4, 5, 2, 7]"),
                arguments("[0,1]", "[0, 1]"),
                arguments("[]", "[]"),
                arguments("[1,0]", "[0, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortArrayByParityII(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().sortArrayByParityII(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }
}