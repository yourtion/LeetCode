package y2021m01d01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

type params struct {
	para1 []int
	para2 int
	ans   bool
}

func Test_20210101(t *testing.T) {
	qs := []params{
		{
			para1: []int{1, 0, 0, 0, 1},
			para2: 1,
			ans:   true,
		},
		{
			para1: []int{1, 0, 0, 0, 1},
			para2: 2,
			ans:   false,
		},
		{
			para1: []int{0, 0, 0, 0, 1},
			para2: 2,
			ans:   true,
		},
		{
			para1: []int{1, 0, 0, 0, 0},
			para2: 2,
			ans:   true,
		},
		{
			para1: []int{1, 0, 0, 0, 0, 1},
			para2: 2,
			ans:   false,
		},
	}

	utils.Segmentation("20210101")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := canPlaceFlowers(p1, p2)
		fmt.Printf("【input】:%v %v \t【output】:%v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
