package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210509(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		para3 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 10, 3, 10, 2}, para2: 3, para3: 1,
			ans: 3,
		},
		{
			para1: []int{1, 10, 3, 10, 2}, para2: 3, para3: 2,
			ans: -1,
		},
		{
			para1: []int{7, 7, 7, 7, 12, 7, 7}, para2: 2, para3: 3,
			ans: 12,
		},
		{
			para1: []int{1000000000, 1000000000}, para2: 1, para3: 1,
			ans: 1000000000,
		},
		{
			para1: []int{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, para2: 4, para3: 2,
			ans: 9,
		},
	}

	utils.Segmentation("20210509")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := minDays(utils.DeepCloneIntSlice(p1), p2, p3)
		fmt.Printf("【input】: %v %d %d \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
