package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210505(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{3, 4, 2},
			ans:  6,
		},
		{
			para: []int{2, 2, 3, 3, 3, 4},
			ans:  9,
		},
	}

	utils.Segmentation("20210505")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := deleteAndEarn(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
