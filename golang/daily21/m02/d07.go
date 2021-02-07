package y2021m02

// 每日一题 20210207
//
// 665. 非递减数列
// Link: https://leetcode-cn.com/problems/non-decreasing-array/
func checkPossibility(nums []int) bool {
	cnt := 0
	for i := 0; i < len(nums)-1; i++ {
		x, y := nums[i], nums[i+1]
		if x > y {
			cnt++
			if cnt > 1 {
				return false
			}
			if i > 0 && y < nums[i-1] {
				nums[i+1] = x
			}
		}
	}
	return true
}
