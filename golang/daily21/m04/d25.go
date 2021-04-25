package y2021m04

// 每日一题 20210425
//
// 897. 递增顺序搜索树
// Link: https://leetcode-cn.com/problems/increasing-order-search-tree/
func increasingBST(root *TreeNode) *TreeNode {
	intArr := []int{}
	var traverse func(root *TreeNode)
	traverse = func(root *TreeNode) {
		if root == nil {
			return
		}
		traverse(root.Left)
		intArr = append(intArr, root.Val)
		traverse(root.Right)
	}
	traverse(root)

	dummy := &TreeNode{}
	curNode := dummy
	for _, val := range intArr {
		curNode.Right = &TreeNode{Val: val}
		curNode = curNode.Right
	}
	return dummy.Right
}
