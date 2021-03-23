package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210323(t *testing.T) {
	type params struct {
		para []*NestedInteger
		ans  []int
	}
	qs := []params{
		{
			para: utils.ConstructorNestedInteger("[[1,1],2,[1,1]]").Ns,
			ans:  []int{1, 1, 2, 1, 1},
		},
		{
			para: utils.ConstructorNestedInteger("[1,[4,[6]]]").Ns,
			ans:  []int{1, 4, 6},
		},
	}

	utils.Segmentation("20210323")

	for _, q := range qs {
		ret, p := q.ans, q.para
		c := ConstructorNestedIterator(p)
		res := []int{}
		for c.HasNext() {
			res = append(res, c.Next())
		}
		fmt.Printf("【input】: %s \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
