package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210424(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3},
			para2: 4,
			ans:   7,
		},
		{
			para1: []int{9},
			para2: 3,
			ans:   0,
		},
	}

	utils.Segmentation("20210424")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := combinationSum4(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
