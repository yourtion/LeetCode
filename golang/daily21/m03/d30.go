package y2021m03

import (
	"sort"
)

// 每日一题 20210330
//
// 74. 搜索二维矩阵
// Link: https://leetcode-cn.com/problems/search-a-2d-matrix/
func searchMatrix(matrix [][]int, target int) bool {
	if len(matrix) < 1 || len(matrix[0]) < 1 {
		return false
	}
	row := sort.Search(len(matrix), func(i int) bool { return matrix[i][0] > target }) - 1
	if row < 0 {
		return false
	}
	col := sort.SearchInts(matrix[row], target)
	return col < len(matrix[row]) && matrix[row][col] == target
}
