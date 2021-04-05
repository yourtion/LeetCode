package y2021m04

// 每日一题 20210405
//
// 88. 合并两个有序数组
// Link: https://leetcode-cn.com/problems/merge-sorted-array/
func merge(nums1 []int, m int, nums2 []int, n int) {
	for i := m + n - 1; i >= 0 && n > 0; i-- {
		// 如果 nums1 已经没有数字或者 nums2 当前数字大于 nums1，则使用 nums2[n-1]
		if m < 1 || nums2[n-1] > nums1[m-1] {
			nums1[i] = nums2[n-1]
			n -= 1
		} else {
			nums1[i] = nums1[m-1]
			m -= 1
		}
	}
}
