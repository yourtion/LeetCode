package y2021m06

// 每日一题 20210602
//
// 523. 连续的子数组和
// Link: https://leetcode-cn.com/problems/continuous-subarray-sum/
func checkSubarraySum(nums []int, k int) bool {
	m := len(nums)
	if m < 2 {
		return false
	}
	mp := map[int]int{0: -1}
	remainder := 0
	for i, num := range nums {
		remainder = (remainder + num) % k
		if prevIndex, has := mp[remainder]; has {
			if i-prevIndex >= 2 {
				return true
			}
		} else {
			mp[remainder] = i
		}
	}
	return false
}
