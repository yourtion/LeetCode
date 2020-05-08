package com.yourtion.leetcode.easy.c1431;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("5384. 拥有最多糖果的孩子")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,3,5,1,3]", 3, "[true, true, true, false, true]"),
                arguments("[4,2,1,1,2]", 1, "[true, false, false, false, false]"),
                arguments("[12,1,12]", 10, "[true, false, true]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void kidsWithCandies(String source, int ext, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, ext, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<Boolean> ret = new Solution().kidsWithCandies(ss, ext);
        Assertions.assertEquals(res, ret.toString());
    }
}