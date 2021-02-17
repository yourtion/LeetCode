package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210120(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 2, 3},
			ans:  6,
		},
		{
			para: []int{1, 2, 3, 4},
			ans:  24,
		},
	}

	utils.Segmentation("20210120")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := maximumProduct(utils.DeepCloneIntSlice(p))
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
