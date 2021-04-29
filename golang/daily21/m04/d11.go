package y2021m04

// 每日一题 20210411
//
// 264. 丑数 II
// Link: https://leetcode-cn.com/problems/ugly-number-ii/
func nthUglyNumber(n int) int {
	min := func(a, b int) int {
		if a < b {
			return a
		}
		return b
	}

	dp := make([]int, n+1)
	dp[1] = 1
	p2, p3, p5 := 1, 1, 1
	for i := 2; i <= n; i++ {
		x2, x3, x5 := dp[p2]*2, dp[p3]*3, dp[p5]*5
		dp[i] = min(min(x2, x3), x5)
		if dp[i] == x2 {
			p2++
		}
		if dp[i] == x3 {
			p3++
		}
		if dp[i] == x5 {
			p5++
		}
	}
	return dp[n]
}