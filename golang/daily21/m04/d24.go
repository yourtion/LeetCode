package y2021m04

// 每日一题 20210424
//
// 377. 组合总和 Ⅳ
// Link: https://leetcode-cn.com/problems/combination-sum-iv/
func combinationSum4(nums []int, target int) int {
	dp := make([]int, target+1)
	dp[0] = 1
	for i := 1; i <= target; i++ {
		for _, num := range nums {
			if num <= i {
				dp[i] += dp[i-num]
			}
		}
	}
	return dp[target]
}
