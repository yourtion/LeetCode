package y2021m01

// 每日一题 20210122
//
// 989. 数组形式的整数加法
// Link: https://leetcode-cn.com/problems/add-to-array-form-of-integer/
func addToArrayForm(A []int, K int) []int {
	n := len(A)
	ret := []int{}
	i := n - 1
	carry := false
	for carry || K > 0 || i >= 0 {
		r := 0
		if i >= 0 && i < n {
			r = A[i]
		}
		if K > 0 {
			r += K % 10
			K = K / 10
		}
		// 处理之前的进位
		if carry {
			r += 1
			carry = false
		}
		// 处理本次进位
		if r >= 10 {
			carry = true
		}
		ret = append([]int{r % 10}, ret...)
		i -= 1
	}
	// 处理最后的进位
	if ret[0] == 0 && len(ret) > 1 {
		ret = ret[1:]
	}
	return ret
}
