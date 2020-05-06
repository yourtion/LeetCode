package com.yourtion.leetcode.easy.c1403;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1403. 非递增顺序的最小子序列")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,3,10,9,8]", "[10, 9]"),
                arguments("[4,4,7,6,7]", "[7, 7, 6]"),
                arguments("[6]", "[6]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minSubsequence(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<Integer> ret = new Solution().minSubsequence(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}