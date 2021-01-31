package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210131(t *testing.T) {
	type params struct {
		para []string
		ans  int
	}
	qs := []params{
		{
			para: []string{"tars", "rats", "arts", "star"},
			ans:  2,
		},
		{
			para: []string{"omv", "ovm"},
			ans:  1,
		},
	}

	utils.Segmentation("20210131")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numSimilarGroups(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
