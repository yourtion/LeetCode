package y2021m05

// 每日一题 20210505
//
// 740. 删除并获得点数
// Link: https://leetcode-cn.com/problems/delete-and-earn/
func deleteAndEarn(nums []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	rob := func(nums []int) int {
		first, second := nums[0], max(nums[0], nums[1])
		for i := 2; i < len(nums); i++ {
			first, second = second, max(first+nums[i], second)
		}
		return second
	}
	maxVal := 0
	for _, val := range nums {
		maxVal = max(maxVal, val)
	}
	sum := make([]int, maxVal+1)
	for _, val := range nums {
		sum[val] += val
	}
	return rob(sum)
}
