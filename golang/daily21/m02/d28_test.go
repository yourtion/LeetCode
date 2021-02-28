package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210228(t *testing.T) {
	type params struct {
		para []int
		ans  bool
	}
	qs := []params{
		{
			para: []int{1, 2, 2, 3},
			ans:  true,
		},
		{
			para: []int{6, 5, 4, 4},
			ans:  true,
		},
		{
			para: []int{1, 3, 2},
			ans:  false,
		},
		{
			para: []int{1, 2, 4, 5},
			ans:  true,
		},
		{
			para: []int{1, 1, 1, 1},
			ans:  true,
		},
		{
			para: []int{1, 1, 0},
			ans:  true,
		},
	}

	utils.Segmentation("20210228")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isMonotonic(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
