package y2021m05

import "sort"

// 每日一题 20210509
//
// 1482. 制作 m 束花所需的最少天数
// Link: https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/
func minDays(bloomDay []int, m int, k int) int {
	if k*m > len(bloomDay) {
		return -1
	}
	maxDay := 0
	for _, day := range bloomDay {
		if day > maxDay {
			maxDay = day
		}
	}
	return sort.Search(maxDay, func(days int) bool {
		flowers, bouquets := 0, 0
		for _, d := range bloomDay {
			if d > days {
				flowers = 0
			} else {
				flowers++
				if flowers == k {
					bouquets++
					flowers = 0
				}
			}
		}
		return bouquets >= m
	})
}
