package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210525(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 2, 0, 3, 0},
			para2: 1,
			ans:   3,
		},
		{
			para1: []int{3, 4, 5, 2, 1, 7, 3, 4, 7},
			para2: 3,
			ans:   3,
		},
		{
			para1: []int{1, 2, 4, 1, 2, 5, 1, 2, 6},
			para2: 3,
			ans:   3,
		},
	}

	utils.Segmentation("20210525")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := minChanges(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
