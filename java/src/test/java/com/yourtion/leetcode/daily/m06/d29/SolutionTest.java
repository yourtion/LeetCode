package com.yourtion.leetcode.daily.m06.d29;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200629")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,2,1,5,6,4]", 2, 5),
                arguments("[3,2,3,1,2,4,5,5,6]", 4, 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findKthLargest(String source, int k, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findKthLargest(ss, k));
    }
}