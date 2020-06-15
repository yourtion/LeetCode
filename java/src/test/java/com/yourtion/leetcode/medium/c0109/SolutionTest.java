package com.yourtion.leetcode.medium.c0109;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("109. 有序链表转换二叉搜索树")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[-10, -3, 0, 5, 9]", "[0, -10, 5, null, -3, null, 9]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortedListToBST(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        TreeNode ret = new Solution().sortedListToBST(head);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}