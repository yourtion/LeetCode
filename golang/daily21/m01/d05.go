package y2021m01

// 每日一题 20210105
//
// 830. 较大分组的位置
// Link: https://leetcode-cn.com/problems/positions-of-large-groups/
func largeGroupPositions(s string) [][]int {
	//goland:noinspection GoPreferNilSlice
	ret := [][]int{}
	// 记录起始位置与长度
	start := 0
	length := len(s)
	for i := 1; i <= length; i++ {
		// 如果在字符串范围内同时跟起点相同，继续循环
		if i < length && s[i] == s[start] {
			continue
		}
		// 如果起点到终点达到 3 个字符，记录下来
		if i-start > 2 {
			ret = append(ret, []int{start, i - 1})
		}
		// 更新起点值
		start = i
	}
	return ret
}
