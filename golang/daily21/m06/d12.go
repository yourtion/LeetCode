package y2021m06

import "math"

// 每日一题 20210612
//
// 1449. 数位成本和为目标值的最大数字
// Link: https://leetcode-cn.com/problems/form-largest-integer-with-digits-that-add-up-to-target/
func largestNumber(cost []int, target int) string {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	dp := make([]int, target+1)
	for i := range dp {
		dp[i] = math.MinInt32
	}
	dp[0] = 0
	for _, c := range cost {
		for j := c; j <= target; j++ {
			dp[j] = max(dp[j], dp[j-c]+1)
		}
	}
	if dp[target] < 0 {
		return "0"
	}
	ans := make([]byte, 0, dp[target])
	for i, j := 8, target; i >= 0; i-- {
		for c := cost[i]; j >= c && dp[j] == dp[j-c]+1; j -= c {
			ans = append(ans, byte('1'+i))
		}
	}
	return string(ans)
}
