package y2021m01

import "sort"

// 每日一题 20210119
//
// 1584. 连接所有点的最小费用
// Link: https://leetcode-cn.com/problems/min-cost-to-connect-all-points/
func minCostConnectPoints(points [][]int) int {
	abs := func(x int) int {
		if x < 0 {
			return -x
		}
		return x
	}
	dist := func(p, q []int) int {
		return abs(p[0]-q[0]) + abs(p[1]-q[1])
	}

	// 构建边
	n := len(points)
	type edge struct{ v, w, dis int }
	edges := []edge{}
	for i, p := range points {
		for j := i + 1; j < n; j++ {
			edges = append(edges, edge{i, j, dist(p, points[j])})
		}
	}
	sort.Slice(edges, func(i, j int) bool { return edges[i].dis < edges[j].dis })

	// 并查集
	set := make([]int, n)
	rank := make([]int, n)
	for i := range set {
		set[i] = i
		rank[i] = 1
	}
	var find func(x int) int
	find = func(x int) int {
		if set[x] != x {
			set[x] = find(set[x])
		}
		return set[x]
	}
	union := func(x, y int) bool {
		fx, fy := find(x), find(y)
		if fx == fy {
			return false
		}
		if rank[fx] < rank[fy] {
			fx, fy = fy, fx
		}
		rank[fx] += rank[fy]
		set[fy] = fx
		return true
	}

	// 查询结果
	left := n - 1
	ret := 0
	for _, e := range edges {
		if union(e.v, e.w) {
			ret += e.dis
			left--
			if left == 0 {
				break
			}
		}
	}
	return ret
}
