package com.yourtion.leetcode.medium.c0081;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("81. 搜索旋转排序数组 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,5,6,0,0,1,2]", 0, true),
                arguments("[2,5,6,0,0,1,2]", 3, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void search(String source, int target, boolean res) {
        System.out.printf("runTest: %s %d , res: %b", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().search(ss, target));
    }
}