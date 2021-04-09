package y2021m04

// 每日一题 20210409
//
// 154. 寻找旋转排序数组中的最小值 II
// Link: https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
func findMin2(nums []int) int {
	low, high := 0, len(nums)-1
	for low < high {
		pivot := low + (high-low)/2
		if nums[pivot] < nums[high] {
			high = pivot
		} else if nums[pivot] > nums[high] {
			low = pivot + 1
		} else {
			high--
		}
	}
	return nums[low]
}
