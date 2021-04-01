package y2021m04

// 每日一题 20210401
//
// 1006. 笨阶乘
// Link: https://leetcode-cn.com/problems/clumsy-factorial/
func clumsy(N int) int {
	ret := 0
	stk := []int{N}
	N--
	// 用于控制乘、除、加、减
	index := 0
	for N > 0 {
		switch index % 4 {
		case 0:
			stk[len(stk)-1] *= N
		case 1:
			stk[len(stk)-1] /= N
		case 2:
			stk = append(stk, N)
		default:
			stk = append(stk, -N)
		}
		N--
		index++
	}

	// 累加栈中数字
	for _, v := range stk {
		ret += v
	}
	return ret
}
