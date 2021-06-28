package y2021m06

import "math"

// 每日一题 20210628
//
// 815. 公交路线
// Link: https://leetcode-cn.com/problems/bus-routes/
func numBusesToDestination(routes [][]int, source int, target int) int {
	if source == target {
		return 0
	}

	n := len(routes)
	edge := make([][]bool, n)
	for i := range edge {
		edge[i] = make([]bool, n)
	}
	rec := map[int][]int{}
	for i, route := range routes {
		for _, site := range route {
			for _, j := range rec[site] {
				edge[i][j] = true
				edge[j][i] = true
			}
			rec[site] = append(rec[site], i)
		}
	}

	dis := make([]int, n)
	for i := range dis {
		dis[i] = -1
	}
	q := []int{}
	for _, bus := range rec[source] {
		dis[bus] = 1
		q = append(q, bus)
	}
	for len(q) > 0 {
		x := q[0]
		q = q[1:]
		for y, b := range edge[x] {
			if b && dis[y] == -1 {
				dis[y] = dis[x] + 1
				q = append(q, y)
			}
		}
	}

	ret := math.MaxInt32
	for _, bus := range rec[target] {
		if dis[bus] != -1 && dis[bus] < ret {
			ret = dis[bus]
		}
	}
	if ret < math.MaxInt32 {
		return ret
	}
	return -1
}
