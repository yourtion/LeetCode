package y2021m05

import (
	"reflect"

	"github.com/yourtion/LeetCode/golang/utils"
)

type TreeNode = utils.TreeNode

// 每日一题 20210510
//
// 872. 叶子相似的树
// Link: https://leetcode-cn.com/problems/leaf-similar-trees/
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
	var traverse func(root *TreeNode, arr *[]int)
	traverse = func(root *TreeNode, arr *[]int) {
		if root == nil {
			return
		}
		traverse(root.Left, arr)
		if root.Left == nil && root.Right == nil {
			*arr = append(*arr, root.Val)
		}
		traverse(root.Right, arr)
	}
	intArr := []int{}
	traverse(root1, &intArr)
	intArr2 := []int{}
	traverse(root2, &intArr2)
	return reflect.DeepEqual(intArr, intArr2)
}
