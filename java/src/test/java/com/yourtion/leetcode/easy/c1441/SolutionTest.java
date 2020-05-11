package com.yourtion.leetcode.easy.c1441;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1441. 用栈操作构建数组")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3]", 3, "[Push, Push, Pop, Push]"),
                arguments("[1,2,3]", 3, "[Push, Push, Push]"),
                arguments("[1,2]", 4, "[Push, Push]"),
                arguments("[2,3,4]", 4, "[Push, Pop, Push, Push, Push]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void buildArray(String source, int n, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, n, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().buildArray(ss, n).toString());
    }
}