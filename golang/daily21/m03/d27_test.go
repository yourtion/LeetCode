package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210327(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 4, 5},
			para2: 2,
			ans:   []int{4, 5, 1, 2, 3},
		},
		{
			para1: []int{0, 1, 2},
			para2: 4,
			ans:   []int{2, 0, 1},
		},
	}

	utils.Segmentation("20210327")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := rotateRight(utils.NewListNode(p1), p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res.ToIntArr()) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
