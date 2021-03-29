package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210329(t *testing.T) {
	type params struct {
		para uint32
		ans  uint32
	}
	qs := []params{
		{
			para: 0b00000010100101000001111010011100,
			ans:  0b00111001011110000010100101000000,
		},
		{
			para: 0b11111111111111111111111111111101,
			ans:  0b10111111111111111111111111111111,
		},
	}

	utils.Segmentation("20210329")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := reverseBits(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
