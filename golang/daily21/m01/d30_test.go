package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210130(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{0, 2}, {1, 3}},
			ans:  3,
		},
		{
			para: [][]int{{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}},
			ans:  16,
		},
	}

	utils.Segmentation("20210130")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := swimInWater(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
