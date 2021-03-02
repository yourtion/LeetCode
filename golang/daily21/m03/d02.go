package y2021m03

// 每日一题 20210302
//
// 304. 二维区域和检索 - 矩阵不可变
// Link: https://leetcode-cn.com/problems/range-sum-query-2d-immutable/
type NumMatrix struct {
	matrix [][]int
}

func ConstructorNumMatrix(matrix [][]int) NumMatrix {
	m := len(matrix)
	if m < 1 {
		return NumMatrix{matrix: [][]int{}}
	}
	n := len(matrix[0])
	mx := make([][]int, m+1)
	mx[0] = make([]int, n+1)
	for i, row := range matrix {
		mx[i+1] = make([]int, n+1)
		for j, v := range row {
			mx[i+1][j+1] = mx[i+1][j] + mx[i][j+1] - mx[i][j] + v
		}
	}
	return NumMatrix{matrix: mx}
}

func (m *NumMatrix) SumRegion(row1 int, col1 int, row2 int, col2 int) int {
	return m.matrix[row2+1][col2+1] - m.matrix[row1][col2+1] - m.matrix[row2+1][col1] + m.matrix[row1][col1]
}
