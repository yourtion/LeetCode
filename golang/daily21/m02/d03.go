package y2021m02

import (
	"sort"
)

// 每日一题 20210203
//
// 480. 滑动窗口中位数
// Link: https://leetcode-cn.com/problems/sliding-window-median/
func medianSlidingWindow(nums []int, k int) []float64 {
	// 有序数组返回中位数
	getMedian := func(nums []int) float64 {
		n := len(nums)
		if n%2 == 1 {
			return float64(nums[n/2])
		} else {
			return (float64(nums[n/2]) + float64(nums[n/2-1])) / 2
		}
	}
	// 二分查找，返回不大于target的元素个数
	findIndex := func(nums []int, target int) int {
		l, r := 0, len(nums)
		mid := (l + r) / 2
		for l < r {
			mid = (l + r) / 2
			if nums[mid] == target {
				r = mid
			} else if target > nums[mid] {
				l = mid + 1
			} else {
				r = mid
			}
		}
		return l
	}

	n := len(nums)
	res := []float64{}
	window := make([]int, k)
	copy(window, nums[:k])
	sort.Ints(window)
	res = append(res, getMedian(window))
	// 这个切片操作真的是搞的我一个头两个大，修了半天bug，有没有大佬有优化的方法
	for i := k; i < n; i++ {
		// 插入新元素
		// 查找插入位置
		insertIndex := findIndex(window, nums[i])
		// 插入
		if insertIndex == len(window) {
			window = append(window, nums[i])
		} else if insertIndex == 0 {
			window = append([]int{nums[i]}, window...)
		} else {
			temp := make([]int, k-insertIndex)
			copy(temp, window[insertIndex:])
			window = append(append(window[:insertIndex], nums[i]), temp...)
		}
		// 移除元素，查找删除元素下标
		deleteIndex := findIndex(window, nums[i-k])
		// 删除
		if deleteIndex == len(window)-1 {
			window = window[:len(window)-1]
		} else if deleteIndex == 0 {
			window = window[1:]
		} else {
			window = append(window[:deleteIndex], window[deleteIndex+1:]...)
		}
		res = append(res, getMedian(window))
	}
	return res
}
