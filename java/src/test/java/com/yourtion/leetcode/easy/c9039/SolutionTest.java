package com.yourtion.leetcode.easy.c9039;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 17.12. BiNode")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,2,5,1,3,null,6,0]", "[0, null, 1, null, 2, null, 3, null, 4, null, 5, null, 6]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void convertBiNode(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().convertBiNode(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}