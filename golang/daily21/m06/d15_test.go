package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210615(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{para: []int{0, 1, 0}, ans: 1},
		{para: []int{0, 2, 1, 0}, ans: 1},
		{para: []int{0, 10, 5, 2}, ans: 1},
		{para: []int{3, 4, 5, 1}, ans: 2},
		{para: []int{24, 69, 100, 99, 79, 78, 67, 36, 26, 19}, ans: 2},
	}

	utils.Segmentation("20210615")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := peakIndexInMountainArray(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
