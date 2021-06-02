package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210602(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   bool
	}
	qs := []params{
		{
			para1: []int{23, 2, 4, 6, 7},
			para2: 6,
			ans:   true,
		},
		{
			para1: []int{23, 2, 6, 4, 7},
			para2: 6,
			ans:   true,
		},
		{
			para1: []int{23, 2, 6, 4, 7},
			para2: 13,
			ans:   false,
		},
	}

	utils.Segmentation("20210602")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := checkSubarraySum(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
