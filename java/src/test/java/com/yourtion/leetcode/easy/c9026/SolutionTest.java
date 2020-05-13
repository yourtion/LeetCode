package com.yourtion.leetcode.easy.c9026;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 02.03. 删除中间节点")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", 3, "[1, 2, 4, 5]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void deleteNode(String source, int n, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, n, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode node = head;
        while (node != null && node.val != n) {
            node = node.next;
        }
        new Solution().deleteNode(node);
        Assertions.assertEquals(res, TestUtils.listNodeToString(head));
    }
}