package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210118(t *testing.T) {
	type params struct {
		para [][]string
		ans  [][]string
	}
	qs := []params{
		{
			para: [][]string{
				{"John", "johnsmith@mail.com", "john00@mail.com"},
				{"John", "johnnybravo@mail.com"},
				{"John", "johnsmith@mail.com", "john_newyork@mail.com"},
				{"Mary", "mary@mail.com"},
			},
			ans: [][]string{
				{"John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"},
				{"John", "johnnybravo@mail.com"},
				{"Mary", "mary@mail.com"},
			},
		},
	}

	utils.Segmentation("20210118")

	slice2dToMap := func(arr [][]string) map[string][]string {
		ret := map[string][]string{}
		for _, v := range arr {
			ret[v[0]] = v[1:]
		}
		return ret
	}

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := accountsMerge(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if !utils.DeepEqual(slice2dToMap(ret), slice2dToMap(res)) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
