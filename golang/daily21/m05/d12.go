package y2021m05

// 每日一题 20210512
//
// 1310. 子数组异或查询
// Link: https://leetcode-cn.com/problems/xor-queries-of-a-subarray/
func xorQueries(arr []int, queries [][]int) []int {
	arr2 := make([]int, len(arr)+1)
	for i, v := range arr {
		arr2[i+1] = arr2[i] ^ v
	}
	ret := make([]int, len(queries))
	for i, q := range queries {
		ret[i] = arr2[q[0]] ^ arr2[q[1]+1]
	}
	return ret
}
