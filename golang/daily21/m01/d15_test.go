package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210115(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}},
			ans:  5,
		},
		{
			para: [][]int{{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}},
			ans:  3,
		},
		{
			para: [][]int{{0, 0}},
			ans:  0,
		},
		{
			para: [][]int{{0, 1}, {1, 0}, {1, 1}},
			ans:  2,
		},
	}

	utils.Segmentation("20210115")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := removeStones(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
