package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210207(t *testing.T) {
	type params struct {
		para []int
		ans  bool
	}
	qs := []params{
		{
			para: []int{4, 2, 3},
			ans:  true,
		},
		{
			para: []int{4, 2, 1},
			ans:  false,
		},
		{
			para: []int{3, 4, 2, 3},
			ans:  false,
		},
		{
			para: []int{1, 4, 2, 3},
			ans:  true,
		},
	}

	utils.Segmentation("20210207")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := checkPossibility(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
