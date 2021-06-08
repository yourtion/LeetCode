package y2021m06

// 每日一题 20210608
//
// 1049. 最后一块石头的重量 II
// Link: https://leetcode-cn.com/problems/last-stone-weight-ii/
func lastStoneWeightII(stones []int) int {
	sum := 0
	for _, v := range stones {
		sum += v
	}
	m := sum / 2
	dp := make([]bool, m+1)
	dp[0] = true
	for _, weight := range stones {
		for j := m; j >= weight; j-- {
			dp[j] = dp[j] || dp[j-weight]
		}
	}
	for j := m; ; j-- {
		if dp[j] {
			return sum - 2*j
		}
	}
}
