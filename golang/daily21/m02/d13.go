package y2021m02

// 每日一题 20210213
//
// 448. 找到所有数组中消失的数字
// Link: https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
func findDisappearedNumbers(nums []int) []int {
	n := len(nums)
	ans := []int{}
	for _, v := range nums {
		v = (v - 1) % n
		nums[v] += n
	}
	for i, v := range nums {
		if v <= n {
			ans = append(ans, i+1)
		}
	}
	return ans
}
