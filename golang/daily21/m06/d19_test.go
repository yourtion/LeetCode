package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210619(t *testing.T) {
	type params struct {
		para []string
		ans  int
	}
	qs := []params{
		{
			para: []string{"un", "iq", "ue"},
			ans:  4,
		},
		{
			para: []string{"cha", "r", "act", "ers"},
			ans:  6,
		},
		{
			para: []string{"abcdefghijklmnopqrstuvwxyz"},
			ans:  26,
		},
	}

	utils.Segmentation("20210619")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := maxLength(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
