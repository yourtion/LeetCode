package y2021m01

// 每日一题 20210126
//
// 1128. 等价多米诺骨牌对的数量
// Link: https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/
func numEquivDominoPairs(dominoes [][]int) int {
	getIndex := func(arr []int) int {
		if arr[0] > arr[1] {
			return arr[1]*10 + arr[0]
		}
		return arr[0]*10 + arr[1]
	}

	ret := 0
	counter := make([]int, 100)
	for _, v := range dominoes {
		key := getIndex(v)
		ret += counter[key]
		counter[key] += 1
	}
	return ret
}
