package com.yourtion.leetcode.daily.m09.d21;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200921")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,2,13]", "[18, 20, 13]"),
                arguments("[5,2,13,null,4]", "[18, 24, 13, null, 22]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void convertBST(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().convertBST(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}