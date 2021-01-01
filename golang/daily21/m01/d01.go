// Package y2021m01d01 每日一题 20210101
// 605. 种花问题
// Link: https://leetcode-cn.com/problems/can-place-flowers/
package y2021m01d01

func canPlaceFlowers(flowerbed []int, n int) bool {
	for i, v := range flowerbed {
		// 如果当前不为空位，跳过
		if v != 0 {
			continue
		}
		// 如果前面没有空位，跳过
		if i != 0 && flowerbed[i-1] != 0 {
			continue
		}
		// 如果后面没有空位，跳过
		if i != len(flowerbed)-1 && flowerbed[i+1] != 0 {
			continue
		}
		// 前后都有空，种花
		n -= 1
		// 记得把标志位修改为已经种花
		flowerbed[i] = 1
		if n <= 0 {
			return true
		}
	}
	return n <= 0
}
