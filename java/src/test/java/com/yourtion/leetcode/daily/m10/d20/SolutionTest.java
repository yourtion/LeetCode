package com.yourtion.leetcode.daily.m10.d20;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201020")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4]", "[1, 4, 2, 3]"),
                arguments("[1,2,3,4,5]", "[1, 5, 2, 4, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reorderList(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        ListNode list = TestUtils.stringToListNode(source);
        new Solution().reorderList(list);
        Assertions.assertEquals(res, TestUtils.listNodeToString(list));
    }
}