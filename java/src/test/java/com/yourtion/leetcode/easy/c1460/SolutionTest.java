package com.yourtion.leetcode.easy.c1460;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1460. 通过翻转子数组使两个数组相等")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4]", "[2,4,1,3]", true),
                arguments("[7]", "[7]", true),
                arguments("[1,12]", "[12,1]", true),
                arguments("[3,7,9]", "[3,7,11]", false),
                arguments("[1,1,1,1,1]", "[1,1,1,1,1]", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canBeEqual(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b", s1, s2, res);
        int[] ss1 = TestUtils.stringToIntegerArray(s1);
        int[] ss2 = TestUtils.stringToIntegerArray(s2);
        Assertions.assertEquals(res, new Solution().canBeEqual(ss1, ss2));
    }
}