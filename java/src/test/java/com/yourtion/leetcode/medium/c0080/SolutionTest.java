package com.yourtion.leetcode.medium.c0080;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("80. 删除排序数组中的重复项 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,1,1,2,2,3]", "[1, 1, 2, 2, 3]", 5),
                arguments("[0,0,1,1,1,1,2,3,3]", "[0, 0, 1, 1, 2, 3, 3]", 7)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void removeDuplicates(String source, String r, int res) {
        System.out.printf("runTest: %s %s , res: %d", source, r, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int ret = new Solution().removeDuplicates(ss);
        Assertions.assertEquals(res, ret);
        Assertions.assertEquals(r, TestUtils.integerArrayToString(ss, ret));

    }
}