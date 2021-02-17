package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210217(t *testing.T) {
	type params struct {
		para1 [][]int
		para2 int
		para3 int
		ans   [][]int
	}
	qs := []params{
		{
			para1: [][]int{{1, 2}, {3, 4}},
			para2: 1,
			para3: 4,
			ans:   [][]int{{1, 2, 3, 4}},
		},
		{
			para1: [][]int{{1, 2}, {3, 4}},
			para2: 2,
			para3: 4,
			ans:   [][]int{{1, 2}, {3, 4}},
		},
	}

	utils.Segmentation("20210217")

	for _, q := range qs {
		ret, p, r, c := q.ans, q.para1, q.para2, q.para3
		res := matrixReshape(p, r, c)
		fmt.Printf("【input】: %v %d %d \t【output】: %v\n", p, r, c, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
