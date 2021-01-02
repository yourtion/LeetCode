package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210102(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 3, -1, -3, 5, 3, 6, 7},
			para2: 3,
			ans:   []int{3, 3, 5, 5, 6, 7},
		},
		{
			para1: []int{1},
			para2: 1,
			ans:   []int{1},
		},
		{
			para1: []int{9, 11},
			para2: 2,
			ans:   []int{11},
		},
		{
			para1: []int{4, -2},
			para2: 2,
			ans:   []int{4},
		},
		{
			para1: []int{7, 2, 4},
			para2: 2,
			ans:   []int{7, 4},
		},
	}

	utils.Segmentation("20210102")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := maxSlidingWindow(p1, p2)
		fmt.Printf("【input】:%v %v \t【output】:%v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
