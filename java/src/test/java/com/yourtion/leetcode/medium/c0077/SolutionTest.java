package com.yourtion.leetcode.medium.c0077;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("77. 组合")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(4, 2, "[[1, 2],[1, 3],[1, 4],[2, 3],[2, 4],[3, 4]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void combine(int n, int k, String res) {
        System.out.printf("runTest: %d %d , res: %s", n, k, res);
        List<List<Integer>> ret = new Solution().combine(n, k);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}