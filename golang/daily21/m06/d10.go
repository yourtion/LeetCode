package y2021m06

// 每日一题 20210610
//
// 518. 零钱兑换 II
// Link: https://leetcode-cn.com/problems/coin-change-2/
func change(amount int, coins []int) int {
	dp := make([]int, amount+1)
	dp[0] = 1
	for _, coin := range coins {
		for i := coin; i <= amount; i++ {
			dp[i] += dp[i-coin]
		}
	}
	return dp[amount]
}
