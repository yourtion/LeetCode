package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210208(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{9, 4, 2, 10, 7, 8, 8, 1, 9},
			ans:  5,
		},
		{
			para: []int{4, 8, 12, 16},
			ans:  2,
		},
		{
			para: []int{100},
			ans:  1,
		},
	}

	utils.Segmentation("20210208")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := maxTurbulenceSize(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
