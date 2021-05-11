package y2021m05

// 每日一题 20210511
//
// 1734. 解码异或后的排列
// Link: https://leetcode-cn.com/problems/decode-xored-permutation/
func decode2(encoded []int) []int {
	n := len(encoded)
	total := 0
	for i := 1; i <= n+1; i++ {
		total ^= i
	}
	odd := 0
	for i := 1; i < n; i += 2 {
		odd ^= encoded[i]
	}
	ret := make([]int, n+1)
	ret[0] = total ^ odd
	for i, v := range encoded {
		ret[i+1] = ret[i] ^ v
	}
	return ret
}
