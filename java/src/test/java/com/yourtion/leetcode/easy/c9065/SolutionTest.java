package com.yourtion.leetcode.easy.c9065;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题54. 二叉搜索树的第k大节点")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,1,4,null,2]", 1, 4),
                arguments("[5,3,6,2,4,null,null,1]", 3, 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void kthLargest(String source, int k, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, k, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().kthLargest(root, k));
    }
}