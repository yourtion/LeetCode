package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210514(t *testing.T) {
	type params struct {
		para int
		ans  string
	}
	qs := []params{
		{para: 3, ans: "III"},
		{para: 4, ans: "IV"},
		{para: 9, ans: "IX"},
		{para: 58, ans: "LVIII"},
		{para: 1994, ans: "MCMXCIV"},
	}

	utils.Segmentation("20210514")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := intToRoman(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
