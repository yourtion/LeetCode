package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210506(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3},
			para2: 1,
			ans:   []int{1, 0, 2, 1},
		},
		{
			para1: []int{6, 2, 7, 3},
			para2: 4,
			ans:   []int{4, 2, 0, 7, 4},
		},
	}

	utils.Segmentation("20210506")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := decode(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
