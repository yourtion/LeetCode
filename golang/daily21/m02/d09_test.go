package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210209(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 2, 1, 2, 3},
			para2: 2,
			ans:   7,
		},
		{
			para1: []int{1, 2, 1, 3, 4},
			para2: 3,
			ans:   3,
		},
	}

	utils.Segmentation("20210209")

	for _, q := range qs {
		ret, p, k := q.ans, q.para1, q.para2
		res := subarraysWithKDistinct(p, k)
		fmt.Printf("【input】: %v %d \t【output】: %d\n", p, k, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
