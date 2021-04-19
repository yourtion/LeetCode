package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210419(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{3, 2, 2, 3},
			para2: 3,
			ans:   []int{2, 2},
		},
		{
			para1: []int{0, 1, 2, 2, 3, 0, 4, 2},
			para2: 2,
			ans:   []int{0, 1, 3, 0, 4},
		},
	}

	utils.Segmentation("20210419")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		arr := utils.DeepCloneIntSlice(p1)
		res := removeElement(arr, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, arr[0:res]) {
			t.Errorf(`"%v" not equal to "%v"`, arr[:res], ret)
		}
	}
}
