package com.yourtion.leetcode.daily.m12.d12;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201212")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,7,4,9,2,5]", 6),
                arguments("[1,17,5,10,13,15,10,5,16,8]", 7),
                arguments("[1,2,3,4,5,6,7,8,9]", 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void wiggleMaxLength(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().wiggleMaxLength(ss));
    }
}