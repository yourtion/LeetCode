package com.yourtion.leetcode.medium.c0061;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("61. 旋转链表")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", 2, "[4, 5, 1, 2, 3]"),
                arguments("[0,1,2]", 4, "[2, 0, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void rotateRight(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        ListNode ss = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().rotateRight(ss, k);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}