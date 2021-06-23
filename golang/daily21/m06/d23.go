package y2021m06

// 每日一题 20210623
//
// 剑指 Offer 15. 二进制中1的个数
// Link: https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
func hammingWeight(num uint32) int {
	ret := 0
	for ; num > 0; num &= num - 1 {
		ret++
	}
	return ret
}
