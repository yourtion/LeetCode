package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210404(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 1, 2},
			ans:  5,
		},
		{
			para: []int{1, 1, 2, 1},
			ans:  7,
		},
		{
			para: []int{10, 10, 10},
			ans:  11,
		},
		{
			para: []int{},
			ans:  0,
		},
	}

	utils.Segmentation("20210404")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numRabbits(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
