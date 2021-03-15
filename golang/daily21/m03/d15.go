package y2021m03

// 每日一题 20210315
//
// 54. 螺旋矩阵
// Link: https://leetcode-cn.com/problems/spiral-matrix/
func spiralOrder(matrix [][]int) []int {
	if len(matrix) == 0 || len(matrix[0]) == 0 {
		return []int{}
	}
	m := len(matrix)
	n := len(matrix[0])
	visited := make([][]bool, m)
	for i := 0; i < m; i++ {
		visited[i] = make([]bool, n)
	}
	r, c, di := 0, 0, 0
	dir := [][]int{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}
	ret := make([]int, m*n)
	for i := 0; i < m*n; i++ {
		ret[i] = matrix[r][c]
		visited[r][c] = true
		nextR, nextC := r+dir[di][0], c+dir[di][1]
		if nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || visited[nextR][nextC] {
			di = (di + 1) % 4
		}
		r += dir[di][0]
		c += dir[di][1]
	}
	return ret
}
