package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210304(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{5, 4}, {6, 4}, {6, 7}, {2, 3}},
			ans:  3,
		},
	}

	utils.Segmentation("20210304")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := maxEnvelopes(utils.DeepCloneIntSlice2d(p))
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
