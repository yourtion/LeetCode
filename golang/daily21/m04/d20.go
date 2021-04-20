package y2021m04

// 每日一题 20210420
//
// 28. 实现 strStr()
// Link: https://leetcode-cn.com/problems/implement-strstr/
func strStr(haystack string, needle string) int {
	if haystack == needle || needle == "" {
		return 0
	}
	m := len(haystack)
	n := len(needle)
	for i := 0; i <= m-n; i++ {
		for j := 0; j < n; j++ {
			if haystack[i+j] != needle[j] {
				break
			}
			if j == n-1 {
				return i
			}
		}
	}
	return -1
}
