package com.yourtion.leetcode.daily.m09.d26;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200926")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,4,8,11,null,13,4,7,2,null,null,5,1]", 22, "[[5, 4, 11, 2],[5, 8, 4, 5]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void pathSum(String source, int sum, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, sum, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<List<Integer>> ret = new Solution().pathSum(root, sum);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}