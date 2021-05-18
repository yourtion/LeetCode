package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210518(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{2, 3, 1, 6, 7},
			ans:  4,
		},
		{
			para: []int{1, 1, 1, 1, 1},
			ans:  10,
		},
		{
			para: []int{2, 3},
			ans:  0,
		},
		{
			para: []int{1, 3, 5, 7, 9},
			ans:  3,
		},
		{
			para: []int{7, 11, 12, 9, 5, 2, 7, 17, 22},
			ans:  8,
		},
	}

	utils.Segmentation("20210518")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := countTriplets(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
