package y2021m03

import "sort"

// 每日一题 20210331
//
// 90. 子集 II
// Link: https://leetcode-cn.com/problems/subsets-ii/
func subsetsWithDup(nums []int) [][]int {
	sort.Ints(nums)
	t := []int{}
	ret := [][]int{}
	var dfs func(bool, int)
	dfs = func(choosePre bool, cur int) {
		if cur == len(nums) {
			ret = append(ret, append([]int(nil), t...))
			return
		}
		dfs(false, cur+1)
		if !choosePre && cur > 0 && nums[cur-1] == nums[cur] {
			return
		}
		t = append(t, nums[cur])
		dfs(true, cur+1)
		t = t[:len(t)-1]
	}
	dfs(false, 0)
	return ret
}
