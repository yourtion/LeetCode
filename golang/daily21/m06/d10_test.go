package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210610(t *testing.T) {
	type params struct {
		para1 int
		para2 []int
		ans   int
	}
	qs := []params{
		{para1: 5, para2: []int{1, 2, 5}, ans: 4},
		{para1: 3, para2: []int{2}, ans: 0},
		{para1: 10, para2: []int{10}, ans: 1},
	}

	utils.Segmentation("20210610")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := change(p1, p2)
		fmt.Printf("【input】: %d %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
