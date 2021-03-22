package y2021m03

// 每日一题 20210322
//
// 191. 位1的个数
// Link: https://leetcode-cn.com/problems/number-of-1-bits/
func hammingWeight(num uint32) int {
	ret := 0
	for num > 0 {
		if num&1 == 1 {
			ret += 1
		}
		num >>= 1
	}
	return ret
}
