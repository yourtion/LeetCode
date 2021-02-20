package y2021m02

// 每日一题 20210220
//
// 697. 数组的度
// Link: https://leetcode-cn.com/problems/degree-of-an-array/
func findShortestSubArray(nums []int) int {
	type entry struct{ cnt, l, r int }
	min := func(a, b int) int {
		if a < b {
			return a
		}
		return b
	}
	mp := map[int]entry{}
	for i, v := range nums {
		if e, has := mp[v]; has {
			e.cnt++
			e.r = i
			mp[v] = e
		} else {
			mp[v] = entry{1, i, i}
		}
	}
	maxCnt, ret := 0, 0
	for _, e := range mp {
		if e.cnt > maxCnt {
			maxCnt, ret = e.cnt, e.r-e.l+1
		} else if e.cnt == maxCnt {
			ret = min(ret, e.r-e.l+1)
		}
	}
	return ret
}
