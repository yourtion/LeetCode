package com.yourtion.leetcode.easy.c1346;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1346. 检查整数及其两倍数是否存在")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[10,2,5,3]", true),
                arguments("[7,1,14,11]", true),
                arguments("[3,1,7,11]", false),
                arguments("[-10,12,-20,-8,15]", true),
                arguments("[-10,12,0,-8,15]", false),
                arguments("[0,0]", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void checkIfExist(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        assertEquals(res, new Solution().checkIfExist(ss));
    }
}