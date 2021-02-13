package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210213(t *testing.T) {
	type params struct {
		para []int
		ans  []int
	}
	qs := []params{
		{
			para: []int{4, 3, 2, 7, 8, 2, 3, 1},
			ans:  []int{5, 6},
		},
	}

	utils.Segmentation("20210213")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findDisappearedNumbers(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
