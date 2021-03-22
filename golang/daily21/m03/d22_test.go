package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210322(t *testing.T) {
	type params struct {
		para uint32
		ans  int
	}
	qs := []params{
		{
			para: 0b00000000000000000000000000001011,
			ans:  3,
		},
		{
			para: 0b00000000000000000000000010000000,
			ans:  1,
		},
		{
			para: 0b11111111111111111111111111111101,
			ans:  31,
		},
	}

	utils.Segmentation("20210322")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := hammingWeight(p)
		fmt.Printf("【input】: %b \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
