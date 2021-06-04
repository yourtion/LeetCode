package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210604(t *testing.T) {
	type params struct {
		para1 *ListNode
		para2 *ListNode
		skip1 int
		skip2 int
		ans   int
	}
	qs := []params{
		{
			para1: utils.NewListNode([]int{4, 1, 8, 4, 5}),
			para2: utils.NewListNode([]int{5, 0, 1, 8, 4, 5}),
			skip1: 2,
			skip2: 3,
			ans:   8,
		},
		{
			para1: utils.NewListNode([]int{0, 9, 1, 2, 4}),
			para2: utils.NewListNode([]int{3, 2, 4}),
			skip1: 3,
			skip2: 1,
			ans:   2,
		},
		{
			para1: utils.NewListNode([]int{2, 6, 4}),
			para2: utils.NewListNode([]int{1, 5}),
			skip1: 3,
			skip2: 2,
			ans:   0,
		},
	}

	utils.Segmentation("20210604")

	for _, q := range qs {
		ret, p1, p2, s1, s2 := q.ans, q.para1, q.para2, q.skip1, q.skip2
		utils.LinkedListCombine(p1, p2, s1, s2)
		res := getIntersectionNode(p1, p2)
		fmt.Printf("【input】: %s %s \t【output】: %v\n", p1, p2, res)
		if ret > 0 && ret != res.Val {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
