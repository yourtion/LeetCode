package y2021m06

import "math/bits"

// 每日一题 20210619
//
// 1239. 串联字符串的最大长度
// Link: https://leetcode-cn.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
func maxLength(arr []string) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	masks := []int{0} // 0 对应空串
	ret := 0

outer:
	for _, s := range arr {
		mask := 0
		for _, ch := range s {
			ch -= 'a'
			if mask>>ch&1 > 0 { // 若 mask 已有 ch，则说明 s 含有重复字母，无法构成可行解
				continue outer
			}
			mask |= 1 << ch // 将 ch 加入 mask 中
		}
		for _, m := range masks {
			if m&mask == 0 { // m 和 mask 无公共元素
				masks = append(masks, m|mask)
				ret = max(ret, bits.OnesCount(uint(m|mask)))
			}
		}
	}

	return ret
}
