package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210316(t *testing.T) {
	type params struct {
		para int
		ans  [][]int
	}
	qs := []params{
		{
			para: 3,
			ans:  [][]int{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}},
		},
		{
			para: 1,
			ans:  [][]int{{1}},
		},
	}

	utils.Segmentation("20210316")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := generateMatrix(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
