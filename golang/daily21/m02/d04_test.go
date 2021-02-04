package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210204(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   float64
	}
	qs := []params{
		{
			para1: []int{1, 12, -5, -6, 50, 3},
			para2: 4,
			ans:   12.75,
		},
		{
			para1: []int{5},
			para2: 1,
			ans:   5,
		},
		{
			para1: []int{0, 4, 0, 3, 2},
			para2: 1,
			ans:   4,
		},
		{
			para1: []int{4, 0, 4, 3, 3},
			para2: 5,
			ans:   2.8,
		},
		{
			para1: []int{7, 4, 5, 8, 8, 3, 9, 8, 7, 6},
			para2: 7,
			ans:   7.0,
		},
	}

	utils.Segmentation("20210204")

	for _, q := range qs {
		ret, p, k := q.ans, q.para1, q.para2
		res := findMaxAverage(p, k)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p, k, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
