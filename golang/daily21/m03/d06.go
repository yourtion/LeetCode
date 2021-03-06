package y2021m03

// 每日一题 20210306
//
// 503. 下一个更大元素 II
// Link: https://leetcode-cn.com/problems/next-greater-element-ii/
func nextGreaterElements(nums []int) []int {
	n := len(nums)
	ret := make([]int, n)
	stack := []int{}
	for i := range ret {
		ret[i] = -1
	}
	for i := 0; i < n*2-1; i++ {
		for len(stack) > 0 && nums[stack[len(stack)-1]] < nums[i%n] {
			ret[stack[len(stack)-1]] = nums[i%n]
			stack = stack[:len(stack)-1]
		}
		stack = append(stack, i%n)
	}
	return ret
}
