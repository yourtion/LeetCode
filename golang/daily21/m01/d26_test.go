package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210126(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{1, 2}, {2, 1}, {3, 4}, {5, 6}},
			ans:  1,
		},
		{
			para: [][]int{{1, 2}, {2, 1}, {2, 1}, {5, 6}},
			ans:  3,
		},
	}

	utils.Segmentation("20210126")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numEquivDominoPairs(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
