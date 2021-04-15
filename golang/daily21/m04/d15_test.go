package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210415(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{2, 3, 2},
			ans:  3,
		},
		{
			para: []int{1, 2, 3, 1},
			ans:  4,
		},
		{
			para: []int{0},
			ans:  0,
		},
	}

	utils.Segmentation("20210415")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := rob(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
