package y2021m03

// 每日一题 20210329
//
// 190. 颠倒二进制位
// Link: https://leetcode-cn.com/problems/reverse-bits/
func reverseBits(num uint32) uint32 {
	var ret uint32
	for i := 0; i < 32 && num > 0; i++ {
		ret |= num & 1 << (31 - i)
		num >>= 1
	}
	return ret
}
