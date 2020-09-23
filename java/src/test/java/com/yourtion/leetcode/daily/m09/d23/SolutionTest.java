package com.yourtion.leetcode.daily.m09.d23;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200923")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3,2,5]", "[2,1,3,null,4,null,7]", "[3, 4, 5, 5, 4, null, 7]"),
                arguments("[]", "[]", "[]"),
                arguments("[]", "[2,1,3,null,4,null,7]", "[2, 1, 3, null, 4, null, 7]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void mergeTrees(String t1, String t2, String res) {
        System.out.printf("runTest: %s %s, res: %s", t1, t2, res);
        TreeNode root1 = TestUtils.stringToTreeNode(t1);
        TreeNode root2 = TestUtils.stringToTreeNode(t2);
        String ret = TestUtils.treeNodeToString(new Solution().mergeTrees(root1, root2));
        Assertions.assertEquals(res, ret);
    }
}