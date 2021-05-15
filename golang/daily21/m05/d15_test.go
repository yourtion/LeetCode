package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210515(t *testing.T) {
	type params struct {
		para string
		ans  int
	}
	qs := []params{
		{para: "III", ans: 3},
		{para: "IV", ans: 4},
		{para: "IX", ans: 9},
		{para: "LVIII", ans: 58},
		{para: "MCMXCIV", ans: 1994},
		{para: "DCXXI", ans: 621},
	}

	utils.Segmentation("20210515")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := romanToInt(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
