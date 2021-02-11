package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210211(t *testing.T) {
	kthLargest := Constructor(3, []int{4, 5, 8, 2})
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{para: 3, ans: 4},
		{para: 5, ans: 5},
		{para: 10, ans: 5},
		{para: 9, ans: 8},
		{para: 4, ans: 8},
	}

	utils.Segmentation("20210211")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := kthLargest.Add(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
