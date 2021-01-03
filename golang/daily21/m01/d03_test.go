package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210103(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 4, 3, 2, 5, 2},
			para2: 3,
			ans:   []int{1, 2, 2, 4, 3, 5},
		},
	}

	utils.Segmentation("20210103")

	for _, q := range qs {
		ret, p, x := q.ans, q.para1, q.para2
		head := utils.NewListNode(p)
		res := partition(head, x).ToIntArr()
		fmt.Printf("【input】:%v %d \t【output】:%v\n", p, x, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
