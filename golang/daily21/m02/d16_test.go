package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210216(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 4, 3, 2},
			ans:  4,
		},
		{
			para: []int{6, 2, 6, 5, 1, 2},
			ans:  9,
		},
	}

	utils.Segmentation("20210216")

	for _, q := range qs {
		ret, p, po := q.ans, q.para, utils.DeepCloneIntSlice(q.para)
		res := arrayPairSum(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", po, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
