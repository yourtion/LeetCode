package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210122(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 2, 0, 0},
			para2: 34,
			ans:   []int{1, 2, 3, 4},
		},
		{
			para1: []int{2, 7, 4},
			para2: 181,
			ans:   []int{4, 5, 5},
		},
		{
			para1: []int{2, 1, 5},
			para2: 806,
			ans:   []int{1, 0, 2, 1},
		},
		{
			para1: []int{9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
			para2: 1,
			ans:   []int{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		},
		{
			para1: []int{0},
			para2: 23,
			ans:   []int{2, 3},
		},
		{
			para1: []int{1},
			para2: 99,
			ans:   []int{1, 0, 0},
		},
		{
			para1: []int{0},
			para2: 0,
			ans:   []int{0},
		},
	}

	utils.Segmentation("20210122")

	for _, q := range qs {
		ret, a, k := q.ans, q.para1, q.para2
		res := addToArrayForm(a, k)
		fmt.Printf("【input】:%v %d \t【output】:%v\n", a, k, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
