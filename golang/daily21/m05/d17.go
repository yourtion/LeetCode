package y2021m05

// 每日一题 20210517
//
// 993. 二叉树的堂兄弟节点
// Link: https://leetcode-cn.com/problems/cousins-in-binary-tree/
func isCousins(root *TreeNode, x int, y int) bool {
	xLevel, yLevel := 0, 0
	var xP *TreeNode
	var yP *TreeNode
	var traverse func(root *TreeNode, level int, parent *TreeNode)
	traverse = func(n *TreeNode, level int, parent *TreeNode) {
		if n == nil {
			return
		}
		if n.Val == x {
			xLevel = level
			xP = parent
		}
		if n.Val == y {
			yLevel = level
			yP = parent
		}
		if xLevel > 0 && yLevel > 0 {
			return
		}
		traverse(n.Left, level+1, n)
		traverse(n.Right, level+1, n)
	}
	traverse(root, 0, root)
	if xLevel == 0 || yLevel == 0 || xP == yP {
		return false
	}
	return xLevel == yLevel
}
