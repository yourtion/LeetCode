package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210516(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{para: []int{3, 10, 5, 25, 2, 8}, ans: 28},
		{para: []int{0}, ans: 0},
		{para: []int{2, 4}, ans: 6},
		{para: []int{8, 10, 2}, ans: 10},
		{para: []int{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}, ans: 127},
	}

	utils.Segmentation("20210516")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findMaximumXOR(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
