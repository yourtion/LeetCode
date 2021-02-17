package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210203(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []float64
	}
	qs := []params{
		{
			para1: []int{1, 3, -1, -3, 5, 3, 6, 7},
			para2: 3,
			ans:   []float64{1, -1, -1, 3, 5, 6},
		},
		{
			para1: []int{2, 3, 4},
			para2: 3,
			ans:   []float64{3},
		},
		{
			para1: []int{2, 3},
			para2: 2,
			ans:   []float64{2.5},
		},
	}

	utils.Segmentation("20210203")

	for _, q := range qs {
		ret, p, k := q.ans, q.para1, q.para2
		res := medianSlidingWindow(utils.DeepCloneIntSlice(p), k)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
