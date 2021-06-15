package y2021m06

import "sort"

// 每日一题 20210615
//
// 852. 山脉数组的峰顶索引
// Link: https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
func peakIndexInMountainArray(arr []int) int {
	return sort.Search(len(arr)-1, func(i int) bool { return arr[i] > arr[i+1] })
}
