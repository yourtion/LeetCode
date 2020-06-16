package com.yourtion.leetcode.daily.m06.d16;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("每日一题 - 20200616")
class CodecTest {

    @Test
    void testCodec() {
        System.out.println("runTest Codec");
        Codec codec = new Codec();
        String source = "[1, 2, 3, null, null, 4, 5]";
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = codec.deserialize(codec.serialize(root));
        Assertions.assertEquals("[1, 2, 3, 4, 5]", TestUtils.treeNodeToString(ret));
    }

}