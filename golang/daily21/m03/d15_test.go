package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210315(t *testing.T) {
	type params struct {
		para [][]int
		ans  []int
	}
	qs := []params{
		{
			para: [][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
			ans:  []int{1, 2, 3, 6, 9, 8, 7, 4, 5},
		},
		{
			para: [][]int{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
			ans:  []int{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7},
		},
	}

	utils.Segmentation("20210315")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := spiralOrder(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
