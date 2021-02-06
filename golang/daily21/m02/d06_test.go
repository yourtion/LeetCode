package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210206(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 4, 5, 6, 1},
			para2: 3,
			ans:   12,
		},
		{
			para1: []int{2, 2, 2},
			para2: 2,
			ans:   4,
		},
		{
			para1: []int{9, 7, 7, 9, 7, 7, 9},
			para2: 7,
			ans:   55,
		},
		{
			para1: []int{1, 1000, 1},
			para2: 1,
			ans:   1,
		},
		{
			para1: []int{1, 79, 80, 1, 1, 1, 200, 1},
			para2: 3,
			ans:   202,
		},
	}

	utils.Segmentation("20210206")

	for _, q := range qs {
		ret, p, k := q.ans, q.para1, q.para2
		res := maxScore(p, k)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p, k, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
