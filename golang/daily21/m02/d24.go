package y2021m02

// 每日一题 20210224
//
// 832. 翻转图像
// Link: https://leetcode-cn.com/problems/flipping-an-image/
func flipAndInvertImage(A [][]int) [][]int {
	n := len(A)
	for i := 0; i < n; i++ {
		k := len(A[i])
		for j := 0; j < k/2; j++ {
			A[i][j], A[i][k-j-1] = A[i][k-j-1], A[i][j]
		}
		for j := 0; j < k; j++ {
			if A[i][j] == 0 {
				A[i][j] = 1
			} else {
				A[i][j] = 0
			}
		}
	}
	return A
}
