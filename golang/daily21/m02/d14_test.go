package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210214(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{0, 2, 1, 3},
			ans:  1,
		},
		{
			para: []int{3, 2, 0, 1},
			ans:  0,
		},
	}

	utils.Segmentation("20210214")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := minSwapsCouples(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
