package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210219(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0},
			para2: 2,
			ans:   6,
		},
		{
			para1: []int{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
			para2: 3,
			ans:   10,
		},
	}

	utils.Segmentation("20210219")

	for _, q := range qs {
		ret, p, k := q.ans, q.para1, q.para2
		res := longestOnes(p, k)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
