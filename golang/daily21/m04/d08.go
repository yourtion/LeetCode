package y2021m04

// 每日一题 20210408
//
// 153. 寻找旋转排序数组中的最小值
// Link: https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
func findMin(nums []int) int {
	for i := 1; i < len(nums); i++ {
		if nums[i] < nums[i-1] {
			return nums[i]
		}
	}
	return nums[0]
}
