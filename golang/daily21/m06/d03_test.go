package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210603(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{0, 1},
			ans:  2,
		},
		{
			para: []int{0, 1, 0},
			ans:  2,
		},
	}

	utils.Segmentation("20210603")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findMaxLength(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
