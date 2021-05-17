package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210517(t *testing.T) {
	type params struct {
		para1 *TreeNode
		para2 int
		para3 int
		ans   bool
	}
	qs := []params{
		{
			para1: utils.NewTreeNode([]int{1, 2, 3, 4}),
			para2: 4, para3: 3, ans: false,
		},
		{
			para1: utils.NewTreeNode([]int{1, 2, 3, null, 4, null, 5}),
			para2: 5, para3: 4, ans: true,
		},
		{
			para1: utils.NewTreeNode([]int{1, 2, 3, null, 4}),
			para2: 2, para3: 3, ans: false,
		},
		{
			para1: utils.NewTreeNode([]int{1, 3, 2, null, null, 7, 4, null, null, 5, 6, null, 8, null, 9}),
			para2: 8, para3: 9, ans: true,
		},
	}

	utils.Segmentation("20210517")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := isCousins(p1, p2, p3)
		fmt.Printf("【input】: %v %d %d \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
