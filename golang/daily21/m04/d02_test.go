package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210402(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1},
			ans:  6,
		},
	}

	utils.Segmentation("20210402")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := trap(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
