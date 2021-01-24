package y2021m01

// 每日一题 20210124
//
// 674. 最长连续递增序列
// Link: https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
func findLengthOfLCIS(nums []int) int {
	if len(nums) < 1 {
		return 0
	}
	ret := 0
	count := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] > nums[i-1] {
			count += 1
			continue
		}
		if count > ret {
			ret = count
		}
		count = 1
	}
	if count > ret {
		ret = count
	}
	return ret
}
