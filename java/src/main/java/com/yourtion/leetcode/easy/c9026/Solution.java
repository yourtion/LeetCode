package com.yourtion.leetcode.easy.c9026;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9026. 面试题 02.03. 删除中间节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
