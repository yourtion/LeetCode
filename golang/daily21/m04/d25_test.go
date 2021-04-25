package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210425(t *testing.T) {
	type params struct {
		para *TreeNode
		ans  []int
	}
	qs := []params{
		{
			para: utils.NewTreeNode([]int{5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9}),
			ans:  []int{1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9},
		},
		{
			para: utils.NewTreeNode([]int{5, 1, 7}),
			ans:  []int{1, null, 5, null, 7},
		},
	}

	utils.Segmentation("20210425")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := increasingBST(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res.ToIntArr()) {
			t.Errorf(`"%v" not equal to "%v"`, res.ToIntArr(), ret)
		}
	}
}
