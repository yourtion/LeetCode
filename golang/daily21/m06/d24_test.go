package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210624(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{1, 1}, {2, 2}, {3, 3}},
			ans:  3,
		},
		{
			para: [][]int{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}},
			ans:  4,
		},
	}

	utils.Segmentation("20210624")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := maxPoints(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
