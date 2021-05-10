package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

var null = utils.NULL

func Test_20210510(t *testing.T) {
	type params struct {
		para1 *TreeNode
		para2 *TreeNode
		ans   bool
	}
	qs := []params{
		{
			para1: utils.NewTreeNode([]int{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4}),
			para2: utils.NewTreeNode([]int{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8}),
			ans:   true,
		},
		{
			para1: utils.NewTreeNode([]int{1}),
			para2: utils.NewTreeNode([]int{1}),
			ans:   true,
		},
		{
			para1: utils.NewTreeNode([]int{1}),
			para2: utils.NewTreeNode([]int{2}),
			ans:   false,
		},
		{
			para1: utils.NewTreeNode([]int{1, 2}),
			para2: utils.NewTreeNode([]int{2, 2}),
			ans:   true,
		},
		{
			para1: utils.NewTreeNode([]int{1, 2, 3}),
			para2: utils.NewTreeNode([]int{1, 3, 2}),
			ans:   false,
		},
	}

	utils.Segmentation("20210510")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := leafSimilar(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
