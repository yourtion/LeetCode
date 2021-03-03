package y2021m03

// 每日一题 20210303
//
// 338. 比特位计数
// Link: https://leetcode-cn.com/problems/counting-bits/
func countBits(num int) []int {
	onesCount := func(x int) int {
		ones := 0
		for ; x > 0; x &= x - 1 {
			ones++
		}
		return ones
	}

	bits := make([]int, num+1)
	for i := range bits {
		bits[i] = onesCount(i)
	}
	return bits
}
