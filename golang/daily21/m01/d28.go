package y2021m01

// 每日一题 20210128
//
// 724. 寻找数组的中心索引
// Link: https://leetcode-cn.com/problems/find-pivot-index/
func pivotIndex(nums []int) int {
	n := len(nums)
	sum := 0
	all := 0
	for _, v := range nums {
		all += v
	}
	for i := 0; i < n; i++ {
		all -= nums[i]
		if sum == all {
			return i
		}
		sum += nums[i]
	}
	return -1
}
