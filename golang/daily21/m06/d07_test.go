package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210607(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 1, 1, 1, 1},
			para2: 3,
			ans:   5,
		},
		{
			para1: []int{1},
			para2: 1,
			ans:   1,
		},
	}

	utils.Segmentation("20210607")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := findTargetSumWays(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
