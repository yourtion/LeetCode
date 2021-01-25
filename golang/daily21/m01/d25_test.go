package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210125(t *testing.T) {
	type params struct {
		para []string
		ans  int
	}
	qs := []params{
		{
			para: []string{" /", "/ "},
			ans:  2,
		},
		{
			para: []string{" /", "  "},
			ans:  1,
		},
		{
			para: []string{"\\/", "/\\"},
			ans:  4,
		},
		{
			para: []string{"/\\", "\\/"},
			ans:  5,
		},
		{
			para: []string{"//", "/ "},
			ans:  3,
		},
	}

	utils.Segmentation("20210125")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := regionsBySlashes(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
