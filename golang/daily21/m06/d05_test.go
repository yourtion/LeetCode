package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210605(t *testing.T) {
	type params struct {
		para1 *ListNode
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: utils.NewListNode([]int{1, 2, 6, 3, 4, 5, 6}),
			para2: 6,
			ans:   []int{1, 2, 3, 4, 5},
		},
		{
			para1: utils.NewListNode([]int{}),
			para2: 1,
			ans:   []int{},
		},
		{
			para1: utils.NewListNode([]int{7, 7, 7, 7}),
			para2: 7,
			ans:   []int{},
		},
	}

	utils.Segmentation("20210605")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := removeElements(p1, p2)
		fmt.Printf("【input】: %s %d \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res.ToIntArr()) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
