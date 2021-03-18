package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210318(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		para3 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 4, 5},
			para2: 2,
			para3: 4,
			ans:   []int{1, 4, 3, 2, 5},
		},
	}

	utils.Segmentation("20210318")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		head := utils.NewListNode(p1)
		res := reverseBetween(head, p2, p3)
		fmt.Printf("【input】: %s %v %v \t【output】: %s\n", head, p2, p3, res)
		if !utils.DeepEqual(res.ToIntArr(), ret) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
