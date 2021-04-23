package y2021m04

import "sort"

// 每日一题 20210423
//
// 368. 最大整除子集
// Link: https://leetcode-cn.com/problems/largest-divisible-subset/
func largestDivisibleSubset(nums []int) []int {
	sort.Ints(nums)
	// 第 1 步：动态规划找出最大子集的个数、最大子集中的最大整数
	n := len(nums)
	dp := make([]int, n)
	for i := range dp {
		dp[i] = 1
	}
	maxSize, maxVal := 1, 1
	for i := 1; i < n; i++ {
		for j, v := range nums[:i] {
			if nums[i]%v == 0 && dp[j]+1 > dp[i] {
				dp[i] = dp[j] + 1
			}
		}
		if dp[i] > maxSize {
			maxSize, maxVal = dp[i], nums[i]
		}
	}
	if maxSize == 1 {
		return []int{nums[0]}
	}
	// 第 2 步：倒推获得最大子集
	res := []int{}
	for i := n - 1; i >= 0 && maxSize > 0; i-- {
		if dp[i] == maxSize && maxVal%nums[i] == 0 {
			res = append(res, nums[i])
			maxVal = nums[i]
			maxSize--
		}
	}
	return res
}
