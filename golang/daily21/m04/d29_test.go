package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210429(t *testing.T) {
	type params struct {
		para []int
		ans  bool
	}
	qs := []params{
		{
			para: []int{0, 1, 3, 5, 6, 8, 12, 17},
			ans:  true,
		},
		{
			para: []int{0, 1, 2, 3, 4, 8, 9, 11},
			ans:  false,
		},
	}

	utils.Segmentation("20210429")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := canCross(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
