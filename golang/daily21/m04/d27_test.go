package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210427(t *testing.T) {
	type params struct {
		para1 *TreeNode
		para2 int
		para3 int
		ans   int
	}
	qs := []params{
		{
			para1: utils.NewTreeNode([]int{10, 5, 15, 3, 7, null, 18}),
			para2: 7,
			para3: 15,
			ans:   32,
		},
		{
			para1: utils.NewTreeNode([]int{10, 5, 15, 3, 7, 13, 18, 1, null, 6}),
			para2: 6,
			para3: 10,
			ans:   23,
		},
	}

	utils.Segmentation("20210427")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := rangeSumBST(p1, p2, p3)
		fmt.Printf("【input】: %v %d, %d \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
