package y2021m04

// 每日一题 20210402
//
// 面试题 17.21. 直方图的水量
// Link: https://leetcode-cn.com/problems/volume-of-histogram-lcci/
func trap(height []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}

	left, right := 0, len(height)-1
	leftMax, rightMax := 0, 0
	ret := 0
	for left < right {
		leftMax = max(leftMax, height[left])
		rightMax = max(rightMax, height[right])
		if height[left] < height[right] {
			ret += leftMax - height[left]
			left++
		} else {
			ret += rightMax - height[right]
			right--
		}
	}
	return ret
}
