package y2021m05

// 每日一题 20210506
//
// 1720. 解码异或后的数组
// Link: https://leetcode-cn.com/problems/decode-xored-array/
func decode(encoded []int, first int) []int {
	ret := make([]int, len(encoded)+1)
	ret[0] = first
	for i, num := range encoded {
		ret[i+1] = ret[i] ^ num
	}
	return ret
}
