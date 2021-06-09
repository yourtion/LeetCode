package y2021m06

// 每日一题 20210609
//
// 879. 盈利计划
// Link: https://leetcode-cn.com/problems/profitable-schemes/
func profitableSchemes(n int, minProfit int, group []int, profit []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	const mod int = 1e9 + 7
	ng := len(group)
	dp := make([][][]int, ng+1)
	for i := range dp {
		dp[i] = make([][]int, n+1)
		for j := range dp[i] {
			dp[i][j] = make([]int, minProfit+1)
		}
	}
	dp[0][0][0] = 1
	for i, members := range group {
		earn := profit[i]
		for j := 0; j <= n; j++ {
			for k := 0; k <= minProfit; k++ {
				if j < members {
					dp[i+1][j][k] = dp[i][j][k]
				} else {
					dp[i+1][j][k] = (dp[i][j][k] + dp[i][j-members][max(0, k-earn)]) % mod
				}
			}
		}
	}
	sum := 0
	for _, d := range dp[ng] {
		sum = (sum + d[minProfit]) % mod
	}
	return sum
}
