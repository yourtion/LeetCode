package y2021m05

// 每日一题 20210507
//
// 1486. 数组异或操作
// Link: https://leetcode-cn.com/problems/xor-operation-in-an-array/
func xorOperation(n int, start int) int {
	ret := start
	for i := 1; i < n; i++ {
		ret ^= start + 2*i
	}
	return ret
}
