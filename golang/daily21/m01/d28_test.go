package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210128(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 7, 3, 6, 5, 6},
			ans:  3,
		},
		{
			para: []int{1, 2, 3},
			ans:  -1,
		},
		{
			para: []int{1, 7, 3, 6, 0, 5, 6},
			ans:  3,
		},
		{
			para: []int{-1, -1, -1, -1, -1, 0},
			ans:  2,
		},
		{
			para: []int{-1},
			ans:  0,
		},
		{
			para: []int{-1, -1, -1, 0, 1, 1},
			ans:  0,
		},
	}

	utils.Segmentation("20210128")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := pivotIndex(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
