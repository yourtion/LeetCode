package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210223(t *testing.T) {
	type params struct {
		para1 []int
		para2 []int
		para3 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 0, 1, 2, 1, 1, 7, 5},
			para2: []int{0, 1, 0, 1, 0, 1, 0, 1},
			para3: 3,
			ans:   16,
		},
	}

	utils.Segmentation("20210223")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := maxSatisfied(p1, p2, p3)
		fmt.Printf("【input】: %v %v %d \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
