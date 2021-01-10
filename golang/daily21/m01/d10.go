package y2021m01

import (
	"fmt"
	"strconv"
)

// 每日一题 20210110
//
// 228. 汇总区间
// Link: https://leetcode-cn.com/problems/summary-ranges/
func summaryRanges(nums []int) []string {
	// 排查为空或者小于一个的情况
	if nums == nil || len(nums) < 1 {
		return []string{}
	}
	var ret []string
	// 初始化值为数组第一个元素
	pre := nums[0]
	for i := 1; i <= len(nums); i++ {
		// 如果当前元素是顺序的，则继续向后走，否则记录到输出
		if i < len(nums) && nums[i] == nums[i-1]+1 {
			continue
		}
		if nums[i-1] == pre {
			// 处理 a == b
			ret = append(ret, strconv.Itoa(pre))
		} else {
			// 处理 a != b
			ret = append(ret, fmt.Sprintf("%d->%d", pre, nums[i-1]))
		}
		// 通过不是最后一个元素，重新计数
		if i < len(nums) {
			pre = nums[i]
		}
	}
	return ret
}
