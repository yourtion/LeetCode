package com.yourtion.leetcode.medium.c0095;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("95. 不同的二叉搜索树 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, "[" +
                        "[1, null, 2, null, 3], " +
                        "[1, null, 3, 2, null], " +
                        "[2, 1, 3], " +
                        "[3, 1, null, null, 2], " +
                        "[3, 2, null, 1, null]" +
                        "]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void generateTrees(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        List<TreeNode> ret = new Solution().generateTrees(source);
        String[] sb = new String[ret.size()];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = TestUtils.treeNodeToString(ret.get(i));
        }
        Assertions.assertEquals(res, Arrays.toString(sb));
    }
}