package com.yourtion.leetcode.medium.c0047;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("47. 全排列 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,1,2]", "[[1, 1, 2],[1, 2, 1],[2, 1, 1]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void permuteUnique(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().permuteUnique(ss);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}