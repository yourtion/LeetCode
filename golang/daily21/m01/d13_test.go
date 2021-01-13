package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210113(t *testing.T) {
	type params struct {
		para [][]int
		ans  []int
	}
	qs := []params{
		{
			para: [][]int{{1, 2}, {1, 3}, {2, 3}},
			ans:  []int{2, 3},
		},
		{
			para: [][]int{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}},
			ans:  []int{1, 4},
		},
	}

	utils.Segmentation("20210113")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findRedundantConnection(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
