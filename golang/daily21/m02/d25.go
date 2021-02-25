package y2021m02

// 每日一题 20210225
//
// 867. 转置矩阵
// Link: https://leetcode-cn.com/problems/transpose-matrix/
func transpose(matrix [][]int) [][]int {
	n := len(matrix)
	if n < 1 {
		return matrix
	}
	m := len(matrix[0])
	if m < 1 {
		return matrix
	}
	ret := make([][]int, m)
	for i := 0; i < m; i++ {
		ret[i] = make([]int, n)
		for j := 0; j < n; j++ {
			ret[i][j] = matrix[j][i]
		}
	}
	return ret
}
