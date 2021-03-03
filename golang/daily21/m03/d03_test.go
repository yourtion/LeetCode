package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210303(t *testing.T) {
	type params struct {
		para int
		ans  []int
	}
	qs := []params{
		{
			para: 2,
			ans:  []int{0, 1, 1},
		},
		{
			para: 5,
			ans:  []int{0, 1, 1, 2, 1, 2},
		},
	}

	utils.Segmentation("20210303")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := countBits(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
