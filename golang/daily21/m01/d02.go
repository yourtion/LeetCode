// 每日一题 20210102
// 239. 滑动窗口最大值
// Link: https://leetcode-cn.com/problems/sliding-window-maximum/
package y2021m01

func maxSlidingWindow(nums []int, k int) []int {
	if k < 2 {
		return nums
	}
	var q []int
	push := func(i int) {
		for len(q) > 0 && nums[i] >= nums[q[len(q)-1]] {
			q = q[:len(q)-1]
		}
		q = append(q, i)
	}

	for i := 0; i < k; i++ {
		push(i)
	}
	n := len(nums)
	ret := make([]int, 1, n-k+1)
	ret[0] = nums[q[0]]
	for i := k; i < n; i++ {
		push(i)
		for q[0] <= i-k {
			q = q[1:]
		}
		ret = append(ret, nums[q[0]])
	}
	return ret
}
