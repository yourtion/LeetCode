package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210612(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   string
	}
	qs := []params{
		{para1: []int{4, 3, 2, 5, 6, 7, 2, 5, 5}, para2: 9, ans: "7772"},
		{para1: []int{7, 6, 5, 5, 5, 6, 8, 7, 8}, para2: 12, ans: "85"},
		{para1: []int{2, 4, 6, 2, 4, 6, 4, 4, 4}, para2: 5, ans: "0"},
		{para1: []int{6, 10, 15, 40, 40, 40, 40, 40, 40}, para2: 47, ans: "32211"},
	}

	utils.Segmentation("20210612")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := largestNumber(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
