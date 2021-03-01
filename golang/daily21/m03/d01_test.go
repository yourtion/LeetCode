package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210301(t *testing.T) {
	numArray := ConstructorNumArray([]int{-2, 0, 3, -5, 2, -1})
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{0, 2}, // return 1 ((-2) + 0 + 3)
			ans:  1,
		},
		{
			para: []int{2, 5}, // return -1 (3 + (-5) + 2 + (-1))
			ans:  -1,
		},
		{
			para: []int{0, 5}, // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
			ans:  -3,
		},
	}

	utils.Segmentation("20210301")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numArray.SumRange(p[0], p[1])
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
