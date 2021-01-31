package y2021m01

// 每日一题 20210131
//
// 839. 相似字符串组
// Link: https://leetcode-cn.com/problems/similar-string-groups/
func numSimilarGroups(strs []string) int {
	type unionFind struct {
		parent, size []int
		setCount     int // 当前连通分量数目
	}

	newUnionFind := func(n int) *unionFind {
		parent := make([]int, n)
		size := make([]int, n)
		for i := range parent {
			parent[i] = i
			size[i] = 1
		}
		return &unionFind{parent, size, n}
	}
	var find func(uf *unionFind, x int) int
	find = func(uf *unionFind, x int) int {
		if uf.parent[x] != x {
			uf.parent[x] = find(uf, uf.parent[x])
		}
		return uf.parent[x]
	}

	union := func(uf *unionFind, x, y int) {
		fx, fy := find(uf, x), find(uf, y)
		if fx == fy {
			return
		}
		if uf.size[fx] < uf.size[fy] {
			fx, fy = fy, fx
		}
		uf.size[fx] += uf.size[fy]
		uf.parent[fy] = fx
		uf.setCount--
	}

	inSameSet := func(uf *unionFind, x, y int) bool {
		return find(uf, x) == find(uf, y)
	}

	isSimilar := func(s, t string) bool {
		diff := 0
		for i := range s {
			if s[i] != t[i] {
				diff++
				if diff > 2 {
					return false
				}
			}
		}
		return true
	}

	n := len(strs)
	uf := newUnionFind(n)
	for i, s := range strs {
		for j := i + 1; j < n; j++ {
			if !inSameSet(uf, i, j) && isSimilar(s, strs[j]) {
				union(uf, i, j)
			}
		}
	}
	return uf.setCount
}
