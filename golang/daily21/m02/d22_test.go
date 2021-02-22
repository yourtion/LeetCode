package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210222(t *testing.T) {
	type params struct {
		para [][]int
		ans  bool
	}
	qs := []params{
		{
			para: [][]int{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}},
			ans:  true,
		},
		{
			para: [][]int{{1, 2}, {2, 2}},
			ans:  false,
		},
		{
			para: [][]int{{1, 2}, {2, 1}},
			ans:  true,
		},
		{
			para: [][]int{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 6, 1, 2}},
			ans:  false,
		},
		{
			para: [][]int{{18}, {66}},
			ans:  true,
		},
		{
			para: [][]int{{18}, {66}},
			ans:  true,
		},
	}

	utils.Segmentation("20210222")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isToeplitzMatrix(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
