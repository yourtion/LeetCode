package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210325(t *testing.T) {
	type params struct {
		para []int
		ans  []int
	}
	qs := []params{
		{
			para: []int{1, 2, 3, 3, 4, 4, 5},
			ans:  []int{1, 2, 5},
		},
		{
			para: []int{1, 1, 1, 2, 3},
			ans:  []int{2, 3},
		},
	}

	utils.Segmentation("20210325")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := deleteDuplicates2(utils.NewListNode(p))
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res.ToIntArr()) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
