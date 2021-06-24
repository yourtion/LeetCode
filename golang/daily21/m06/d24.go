package y2021m06

// 每日一题 20210624
//
// 149. 直线上最多的点数
// Link: https://leetcode-cn.com/problems/max-points-on-a-line/submissions/
func maxPoints(points [][]int) int {
	gcd := func(a, b int) int {
		for a != 0 {
			a, b = b%a, a
		}
		return b
	}
	abs := func(x int) int {
		if x < 0 {
			return -x
		}
		return x
	}
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}

	n := len(points)
	if n <= 2 {
		return n
	}
	ret := 0
	for i, p := range points {
		if ret >= n-i || ret > n/2 {
			break
		}
		cnt := map[int]int{}
		for _, q := range points[i+1:] {
			x, y := p[0]-q[0], p[1]-q[1]
			if x == 0 {
				y = 1
			} else if y == 0 {
				x = 1
			} else {
				if y < 0 {
					x, y = -x, -y
				}
				g := gcd(abs(x), abs(y))
				x /= g
				y /= g
			}
			cnt[y+x*20001]++
		}
		for _, c := range cnt {
			ret = max(ret, c+1)
		}
	}
	return ret
}
