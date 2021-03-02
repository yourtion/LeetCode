package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210302(t *testing.T) {
	numMatrix := ConstructorNumMatrix([][]int{
		{3, 0, 1, 4, 2},
		{5, 6, 3, 2, 1},
		{1, 2, 0, 1, 5},
		{4, 1, 0, 1, 7},
		{1, 0, 3, 0, 5},
	})
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{2, 1, 4, 3},
			ans:  8,
		},
		{
			para: []int{1, 1, 2, 2},
			ans:  11,
		},
		{
			para: []int{1, 2, 2, 4},
			ans:  12,
		},
	}

	utils.Segmentation("20210302")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numMatrix.SumRegion(p[0], p[1], p[2], p[3])
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
