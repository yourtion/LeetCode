package com.yourtion.leetcode.easy.c9050;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题18. 删除链表的节点")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,5,1,9]", 5, "[4, 1, 9]"),
                arguments("[4,5,1,9]", 1, "[4, 5, 9]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void deleteNode(String source, int val, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, val, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().deleteNode(head, val);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}