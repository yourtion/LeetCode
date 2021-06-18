package y2021m06

import (
	"math"
	"math/bits"
	"strconv"
)

// 每日一题 20210618
//
// 483. 最小好进制
// Link: https://leetcode-cn.com/problems/smallest-good-base/
func smallestGoodBase(n string) string {
	nVal, _ := strconv.Atoi(n)
	mMax := bits.Len(uint(nVal)) - 1
	for m := mMax; m > 1; m-- {
		k := int(math.Pow(float64(nVal), 1/float64(m)))
		mul, sum := 1, 1
		for i := 0; i < m; i++ {
			mul *= k
			sum += mul
		}
		if sum == nVal {
			return strconv.Itoa(k)
		}
	}
	return strconv.Itoa(nVal - 1)
}
