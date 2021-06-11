package y2021m06

import "math"

// 每日一题 20210611
//
// 279. 完全平方数
// Link: https://leetcode-cn.com/problems/perfect-squares/
func numSquares(n int) int {
	min := func(a, b int) int {
		if a < b {
			return a
		}
		return b
	}
	f := make([]int, n+1)
	for i := 1; i <= n; i++ {
		minn := math.MaxInt32
		for j := 1; j*j <= i; j++ {
			minn = min(minn, f[i-j*j])
		}
		f[i] = minn + 1
	}
	return f[n]
}
