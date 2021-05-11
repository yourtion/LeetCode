package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210511(t *testing.T) {
	type params struct {
		para []int
		ans  []int
	}
	qs := []params{
		{
			para: []int{3, 1},
			ans:  []int{1, 2, 3},
		},
		{
			para: []int{6, 5, 4, 6},
			ans:  []int{2, 4, 1, 5, 3},
		},
	}

	utils.Segmentation("20210511")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := decode2(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
