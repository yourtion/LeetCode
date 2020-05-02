package com.yourtion.leetcode.daily.m03.d11;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200311")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[0,2,1,-6,6,-7,9,1,2,0,1]", true),
                arguments("[0,2,1,-6,6,7,9,-1,2,0,1]", false),
                arguments("[3,3,6,5,-2,2,5,1,-9,4]", true),
                arguments("[10,-10,10,-10,10,-10,10,-10]", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canThreePartsEqualSum(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().canThreePartsEqualSum(ss));
    }
}