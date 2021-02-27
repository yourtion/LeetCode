package y2021m02

// 每日一题 20210227
//
// 395. 至少有 K 个重复字符的最长子串
// Link: https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters/
func longestSubstring(s string, k int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	ret := 0
	for t := 1; t <= 26; t++ {
		cnt := [26]int{}
		total := 0
		lessK := 0
		l := 0
		for r, ch := range s {
			ch -= 'a'
			if cnt[ch] == 0 {
				total++
				lessK++
			}
			cnt[ch]++
			if cnt[ch] == k {
				lessK--
			}

			for total > t {
				ch2 := s[l] - 'a'
				if cnt[ch2] == k {
					lessK++
				}
				cnt[ch2]--
				if cnt[ch2] == 0 {
					total--
					lessK--
				}
				l++
			}
			if lessK == 0 {
				ret = max(ret, r-l+1)
			}
		}
	}
	return ret
}
