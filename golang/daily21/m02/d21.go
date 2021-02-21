package y2021m02

// 每日一题 20210221
//
// 1438. 绝对差不超过限制的最长连续子数组
// Link: https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
func longestSubarray(nums []int, limit int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	var minQ, maxQ []int
	left, ret := 0, 0
	for right, v := range nums {
		for len(minQ) > 0 && minQ[len(minQ)-1] > v {
			minQ = minQ[:len(minQ)-1]
		}
		minQ = append(minQ, v)
		for len(maxQ) > 0 && maxQ[len(maxQ)-1] < v {
			maxQ = maxQ[:len(maxQ)-1]
		}
		maxQ = append(maxQ, v)
		for len(minQ) > 0 && len(maxQ) > 0 && maxQ[0]-minQ[0] > limit {
			if nums[left] == minQ[0] {
				minQ = minQ[1:]
			}
			if nums[left] == maxQ[0] {
				maxQ = maxQ[1:]
			}
			left++
		}
		ret = max(ret, right-left+1)
	}
	return ret
}
