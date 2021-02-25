package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210225(t *testing.T) {
	type params struct {
		para [][]int
		ans  [][]int
	}
	qs := []params{
		{
			para: [][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
			ans:  [][]int{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}},
		},
		{
			para: [][]int{{1, 2, 3}, {4, 5, 6}},
			ans:  [][]int{{1, 4}, {2, 5}, {3, 6}},
		},
	}

	utils.Segmentation("20210225")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := transpose(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
