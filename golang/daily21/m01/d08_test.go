package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210108(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 4, 5, 6, 7},
			para2: 3,
			ans:   []int{5, 6, 7, 1, 2, 3, 4},
		},
		{
			para1: []int{-1, -100, 3, 99},
			para2: 2,
			ans:   []int{3, 99, -1, -100},
		},
	}

	utils.Segmentation("20210108")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		rotate(p1, p2)
		fmt.Printf("【input】:%v %v \t【output】:%v\n", p1, p2, p1)
		if !utils.DeepEqual(ret, p1) {
			t.Errorf(`"%v" not equal to "%v"`, p1, ret)
		}
	}
}
