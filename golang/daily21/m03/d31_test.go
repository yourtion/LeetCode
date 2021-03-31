package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210331(t *testing.T) {
	type params struct {
		para []int
		ans  [][]int
	}
	qs := []params{
		{
			para: []int{1, 2, 2},
			ans:  [][]int{{}, {1}, {1, 2}, {1, 2, 2}, {2}, {2, 2}},
		},
		{
			para: []int{0},
			ans:  [][]int{{}, {0}},
		},
	}

	utils.Segmentation("20210331")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := subsetsWithDup(utils.DeepCloneIntSlice(p))
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
