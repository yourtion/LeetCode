package y2021m06

import (
	"fmt"
	"math/bits"
)

// 每日一题 20210621
//
// 401. 二进制手表
// Link: https://leetcode-cn.com/problems/binary-watch/
func readBinaryWatch(turnedOn int) []string {
	ret := []string{}
	for h := uint8(0); h < 12; h++ {
		for m := uint8(0); m < 60; m++ {
			if bits.OnesCount8(h)+bits.OnesCount8(m) == turnedOn {
				ret = append(ret, fmt.Sprintf("%d:%02d", h, m))
			}
		}
	}
	return ret
}
