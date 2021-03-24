package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210324(t *testing.T) {
	type params struct {
		para []int
		ans  bool
	}
	qs := []params{
		{
			para: []int{1, 2, 3, 4},
			ans:  false,
		},
		{
			para: []int{3, 1, 4, 2},
			ans:  true,
		},
		{
			para: []int{-1, 3, 2, 0},
			ans:  true,
		},
		{
			para: []int{3, 5, 0, 3, 4},
			ans:  true,
		},
	}

	utils.Segmentation("20210324")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := find132pattern(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
