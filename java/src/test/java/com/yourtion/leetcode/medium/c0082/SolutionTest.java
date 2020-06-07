package com.yourtion.leetcode.medium.c0082;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("82. 删除排序链表中的重复元素 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,3,4,4,5]", "[1, 2, 5]"),
                arguments("[1,1,1,2,3]", "[2, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void deleteDuplicates(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().deleteDuplicates(head);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}