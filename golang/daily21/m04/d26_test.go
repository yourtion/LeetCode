package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210426(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			para2: 5,
			ans:   15,
		},
		{
			para1: []int{3, 2, 2, 4, 1, 4},
			para2: 3,
			ans:   6,
		},
		{
			para1: []int{1, 2, 3, 1, 1},
			para2: 4,
			ans:   3,
		},
	}

	utils.Segmentation("20210426")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := shipWithinDays(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
