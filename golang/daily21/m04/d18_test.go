package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210418(t *testing.T) {
	type params struct {
		para []int
		ans  []int
	}
	qs := []params{
		{
			para: []int{1, 1, 2},
			ans:  []int{1, 2},
		},
		{
			para: []int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
			ans:  []int{0, 1, 2, 3, 4},
		},
		{
			para: []int{0},
			ans:  []int{0, 1, 2, 3, 4},
		},
	}

	utils.Segmentation("20210418")

	for _, q := range qs {
		ret, p := q.ans, q.para
		arr := utils.DeepCloneIntSlice(p)
		res := removeDuplicates(arr)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, arr[0:res]) {
			t.Errorf(`"%v" not equal to "%v"`, arr[:res], ret)
		}

	}
}
