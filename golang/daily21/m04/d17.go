package y2021m04

// 每日一题 20210417
//
// 220. 存在重复元素 III
// Link: https://leetcode-cn.com/problems/contains-duplicate-iii/
func containsNearbyAlmostDuplicate(nums []int, k int, t int) bool {
	getID := func(x, w int) int {
		if x >= 0 {
			return x / w
		}
		return (x+1)/w - 1
	}
	abs := func(x int) int {
		if x < 0 {
			return -x
		}
		return x
	}

	mp := map[int]int{}
	for i, x := range nums {
		id := getID(x, t+1)
		if _, has := mp[id]; has {
			return true
		}
		if y, has := mp[id-1]; has && abs(x-y) <= t {
			return true
		}
		if y, has := mp[id+1]; has && abs(x-y) <= t {
			return true
		}
		mp[id] = x
		if i >= k {
			delete(mp, getID(nums[i-k], t+1))
		}
	}
	return false
}
