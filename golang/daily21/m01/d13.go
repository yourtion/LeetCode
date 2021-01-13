package y2021m01

// 每日一题 20210113
//
// 684. 冗余连接
// Link: https://leetcode-cn.com/problems/redundant-connection/
func findRedundantConnection(edges [][]int) []int {
	n := len(edges)
	// 并查集
	set := make([]int, n+1)
	// 初始化
	for i := 0; i < n; i++ {
		set[i] = i
	}
	// 查找
	var find func(i int) int
	find = func(x int) int {
		if set[x] == x {
			return x
		}
		set[x] = find(set[x])
		return find(set[x])
	}
	// 合并
	merge := func(i, j int) {
		set[find(i)] = find(j)
	}

	// 开始执行查询
	for _, v := range edges {
		if find(v[0]) == find(v[1]) {
			return v
		}
		merge(v[0], v[1])
	}
	return []int{}
}
