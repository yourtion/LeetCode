package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

var null = utils.NULL

func Test_20210328(t *testing.T) {
	bs := utils.NewTreeNode([]int{7, 3, 15, null, null, 9, 20})
	it := ConstructorBSTIterator(bs)
	type params struct {
		// 1: next() 2: hasNext()
		para int
		ans  interface{}
	}
	qs := []params{
		{para: 1, ans: 3},
		{para: 1, ans: 7},
		{para: 2, ans: true},
		{para: 1, ans: 9},
		{para: 2, ans: true},
		{para: 1, ans: 15},
		{para: 2, ans: true},
		{para: 1, ans: 20},
		{para: 2, ans: false},
	}

	utils.Segmentation("20210328")

	for _, q := range qs {
		ret, p := q.ans, q.para
		var res interface{}
		var name string
		if p == 1 {
			res = it.Next()
			name = "Next"
		}
		if p == 2 {
			res = it.HasNext()
			name = "HasNext"
		}
		fmt.Printf("【input】: %v \t【output】: %v\n", name, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
