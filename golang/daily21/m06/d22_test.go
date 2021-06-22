package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210622(t *testing.T) {
	type params struct {
		para string
		ans  []string
	}
	qs := []params{
		{
			para: "abc",
			ans:  []string{"abc", "acb", "bac", "bca", "cab", "cba"},
		},
	}

	utils.Segmentation("20210622")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := permutation(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
