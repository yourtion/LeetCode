package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210212(t *testing.T) {
	type params struct {
		para int
		ans  []int
	}
	qs := []params{
		{
			para: 3,
			ans:  []int{1, 3, 3, 1},
		},
	}

	utils.Segmentation("20210212")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := getRow(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
