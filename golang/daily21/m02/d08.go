package y2021m02

// 每日一题 20210208
//
// 978. 最长湍流子数组
// Link: https://leetcode-cn.com/problems/longest-turbulent-subarray/
func maxTurbulenceSize(arr []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	n := len(arr)
	ans := 1
	left, right := 0, 0
	for right < n-1 {
		if left == right {
			if arr[left] == arr[left+1] {
				left++
			}
			right++
		} else {
			if arr[right-1] < arr[right] && arr[right] > arr[right+1] {
				right++
			} else if arr[right-1] > arr[right] && arr[right] < arr[right+1] {
				right++
			} else {
				left = right
			}
		}
		ans = max(ans, right-left+1)
	}
	return ans
}
