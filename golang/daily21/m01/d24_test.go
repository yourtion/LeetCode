package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210124(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 3, 5, 4, 7},
			ans:  3,
		},
		{
			para: []int{2, 2, 2, 2, 2},
			ans:  1,
		},
		{
			para: []int{},
			ans:  0,
		},
		{
			para: []int{1, 3, 5, 7},
			ans:  4,
		},
		{
			para: []int{1},
			ans:  1,
		},
	}

	utils.Segmentation("20210124")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findLengthOfLCIS(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
