package com.yourtion.leetcode.easy.c9024;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 02.02. 返回倒数第 k 个节点")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", 2, 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void kthToLast(String source, int k, int res) {
        System.out.printf("runTest: %s %d, res: %d", source, k, res);
        ListNode head = TestUtils.stringToListNode(source);
        Assertions.assertEquals(res, new Solution().kthToLast(head, k));
    }
}