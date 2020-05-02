package com.yourtion.leetcode.daily.m03.d23;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200323")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", "[3, 4, 5]"),
                arguments("[1,2,3,4,5,6]", "[4, 5, 6]"),
                arguments("[]", "[]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void middleNode(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        ListNode n = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().middleNode(n);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}