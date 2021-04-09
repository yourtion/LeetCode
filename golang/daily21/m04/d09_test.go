package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210409(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 3, 5},
			ans:  1,
		},
		{
			para: []int{2, 2, 2, 0, 1},
			ans:  0,
		},
	}

	utils.Segmentation("20210409")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findMin2(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
