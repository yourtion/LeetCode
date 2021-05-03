package y2021m05

import "math"

// 每日一题 20210503
//
// 7. 整数反转
// Link: https://leetcode-cn.com/problems/reverse-integer/
func reverse(x int) int {
	var ret int32 = 0
	symbol := 1
	if x < 0 {
		symbol = -1
		x = x * -1
	}
	for x > 0 {
		if ret > math.MaxInt32/10 {
			return 0
		}
		ret = ret*10 + (int32)(x%10)
		x = x / 10
	}
	return symbol * int(ret)
}
