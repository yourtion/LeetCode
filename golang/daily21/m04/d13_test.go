package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

var null = utils.NULL

func Test_20210413(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{4, 2, 6, 1, 3},
			ans:  1,
		},
		{
			para: []int{1, 0, 48, null, null, 12, 49},
			ans:  1,
		},
	}

	utils.Segmentation("20210413")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := minDiffInBST(utils.NewTreeNode(p))
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
