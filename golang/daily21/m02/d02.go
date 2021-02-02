package y2021m02

// 每日一题 20210202
//
// 424. 替换后的最长重复字符
// Link: https://leetcode-cn.com/problems/longest-repeating-character-replacement/
func characterReplacement(s string, k int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	cnt := [26]int{}
	maxCnt, left := 0, 0
	for right, ch := range s {
		cnt[ch-'A']++
		maxCnt = max(maxCnt, cnt[ch-'A'])
		if right-left+1-maxCnt > k {
			cnt[s[left]-'A']--
			left++
		}
	}
	return len(s) - left
}
