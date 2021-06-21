package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210621(t *testing.T) {
	type params struct {
		para int
		ans  []string
	}
	qs := []params{
		{
			para: 1,
			ans:  []string{"0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"},
		},
		{
			para: 9,
			ans:  []string{},
		},
	}

	utils.Segmentation("20210621")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := readBinaryWatch(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(res, ret) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
