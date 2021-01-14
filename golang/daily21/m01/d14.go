package y2021m01

// 每日一题 20210114
//
// 1018. 可被 5 整除的二进制前缀
// Link: https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
func prefixesDivBy5(A []int) []bool {
	r := 0
	ret := make([]bool, len(A))
	for i, v := range A {
		// 按位累加并计算能否被 5 整除
		r = r*2 + v
		r = r % 5
		ret[i] = r == 0
	}
	return ret
}
