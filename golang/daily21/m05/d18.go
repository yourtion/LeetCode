package y2021m05

// 每日一题 20210518
//
// 1442. 形成两个异或相等数组的三元组数目
// Link: https://leetcode-cn.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
func countTriplets(arr []int) int {
	n := len(arr)
	s := make([]int, n+1)
	for i, v := range arr {
		s[i+1] = s[i] ^ v
	}
	cnt := map[int]int{}
	total := map[int]int{}
	ret := 0
	for k := 0; k < n; k++ {
		if m, has := cnt[s[k+1]]; has {
			ret += m*k - total[s[k+1]]
		}
		cnt[s[k]]++
		total[s[k]] += k
	}
	return ret
}
