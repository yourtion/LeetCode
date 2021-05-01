package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210501(t *testing.T) {
	type params struct {
		para1 []*Employee
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []*Employee{
				{1, 5, []int{2, 3}},
				{2, 3, []int{}},
				{3, 3, []int{}},
			},
			para2: 1,
			ans:   11,
		},
	}

	utils.Segmentation("20210501")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := getImportance(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
