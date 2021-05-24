package y2021m05

import "math"

// 每日一题 20210524
//
// 664. 奇怪的打印机
// Link: https://leetcode-cn.com/problems/strange-printer/
func strangePrinter(s string) int {
	min := func(a, b int) int {
		if a < b {
			return a
		}
		return b
	}
	n := len(s)
	f := make([][]int, n)
	for i := range f {
		f[i] = make([]int, n)
	}
	for i := n - 1; i >= 0; i-- {
		f[i][i] = 1
		for j := i + 1; j < n; j++ {
			if s[i] == s[j] {
				f[i][j] = f[i][j-1]
			} else {
				f[i][j] = math.MaxInt64
				for k := i; k < j; k++ {
					f[i][j] = min(f[i][j], f[i][k]+f[k+1][j])
				}
			}
		}
	}
	return f[0][n-1]
}
