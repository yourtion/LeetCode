package y2021m04

import (
	"math"

	"github.com/yourtion/LeetCode/golang/utils"
)

type TreeNode = utils.TreeNode

// 每日一题 20210413
//
// 783. 二叉搜索树节点最小距离
// Link: https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
func minDiffInBST(root *TreeNode) int {
	min := func(a, b int) int {
		if a < b {
			return a
		}
		return b
	}

	ret := math.MaxInt8
	pre := math.MinInt8

	var traverse func(root *TreeNode)
	traverse = func(node *TreeNode) {
		if node == nil {
			return
		}
		traverse(node.Left)
		ret = min(ret, node.Val-pre)
		pre = node.Val
		traverse(node.Right)
	}
	traverse(root)
	return ret
}
