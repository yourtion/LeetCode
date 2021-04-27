package y2021m04

// 每日一题 20210427
//
// 938. 二叉搜索树的范围和
// Link: https://leetcode-cn.com/problems/range-sum-of-bst/
func rangeSumBST(root *TreeNode, low int, high int) int {
	ret := 0
	var traverse func(root *TreeNode)
	traverse = func(root *TreeNode) {
		if root == nil {
			return
		}
		traverse(root.Left)
		if root.Val >= low && root.Val <= high {
			ret += root.Val
		}
		if root.Val > high {
			return
		}
		traverse(root.Right)
	}
	traverse(root)
	return ret
}
