package y2021m03

import "github.com/yourtion/LeetCode/golang/utils"

type TreeNode = utils.TreeNode

// 每日一题 20210328
//
// 173. 二叉搜索树迭代器
// Link: https://leetcode-cn.com/problems/binary-search-tree-iterator/
type BSTIterator struct {
	arr []int
}

func ConstructorBSTIterator(root *TreeNode) BSTIterator {
	it := BSTIterator{}
	it.inorder(root)
	return it
}

func (it *BSTIterator) inorder(node *TreeNode) {
	if node == nil {
		return
	}
	it.inorder(node.Left)
	it.arr = append(it.arr, node.Val)
	it.inorder(node.Right)
}

func (it *BSTIterator) Next() int {
	if !it.HasNext() {
		return -1
	}
	val := it.arr[0]
	it.arr = it.arr[1:]
	return val
}

func (it *BSTIterator) HasNext() bool {
	return len(it.arr) > 0
}
