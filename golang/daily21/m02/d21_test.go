package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210221(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{8, 2, 4, 7},
			para2: 4,
			ans:   2,
		},
		{
			para1: []int{10, 1, 2, 4, 7, 2},
			para2: 5,
			ans:   4,
		},
		{
			para1: []int{4, 2, 2, 2, 4, 4, 2, 2},
			para2: 0,
			ans:   3,
		},
	}

	utils.Segmentation("20210221")

	for _, q := range qs {
		ret, p, l := q.ans, q.para1, q.para2
		res := longestSubarray(p, l)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p, l, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
