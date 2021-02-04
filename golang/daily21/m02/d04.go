package y2021m02

// 每日一题 20210204
//
// 643. 子数组最大平均数 I
// Link: https://leetcode-cn.com/problems/maximum-average-subarray-i/
func findMaxAverage(nums []int, k int) float64 {
	if len(nums) < k {
		return 0
	}
	c := 0
	for i := 0; i < k; i++ {
		c += nums[i]
	}
	max := c
	for i := k; i < len(nums); i++ {
		c = c + nums[i] - nums[i-k]
		if c > max {
			max = c
		}
	}
	return float64(max) / float64(k)
}
