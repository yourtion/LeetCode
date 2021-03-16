package y2021m03

// 每日一题 20210316
//
// 59. 螺旋矩阵 II
// Link: https://leetcode-cn.com/problems/spiral-matrix-ii/
func generateMatrix(n int) [][]int {
	ret := make([][]int, n)
	for i := 0; i < n; i++ {
		ret[i] = make([]int, n)
	}
	l, r, t, b := 0, n-1, 0, n-1
	num := 1
	tar := n * n
	for num <= tar {
		// left to right.
		for i := l; i <= r; i++ {
			ret[t][i] = num
			num += 1
		}
		t += 1
		// top to bottom.
		for i := t; i <= b; i++ {
			ret[i][r] = num
			num += 1
		}
		r -= 1
		// right to left.
		for i := r; i >= l; i-- {
			ret[b][i] = num
			num += 1
		}
		b -= 1
		// bottom to top.
		for i := b; i >= t; i-- {
			ret[i][l] = num
			num += 1
		}
		l += 1
	}
	return ret
}
