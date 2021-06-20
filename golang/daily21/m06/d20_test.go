package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210620(t *testing.T) {
	type params struct {
		para1 []string
		para2 [][]string
		ans   [][]string
	}
	qs := []params{
		{
			para1: []string{
				"ThroneInheritance",
				"birth", "birth", "birth", "birth", "birth", "birth",
				"getInheritanceOrder",
				"death",
				"getInheritanceOrder",
			},
			para2: [][]string{
				{"king"},
				{"king", "andy"},
				{"king", "bob"},
				{"king", "catherine"},
				{"andy", "matthew"},
				{"bob", "alex"},
				{"bob", "asha"},
				{""}, {"bob"}, {""}},
			ans: [][]string{
				{"king", "andy", "matthew", "bob", "alex", "asha", "catherine"},
				{"king", "andy", "matthew", "alex", "asha", "catherine"},
			},
		},
	}

	utils.Segmentation("20210620")

	for _, q := range qs {
		var ins ThroneInheritance
		order := 0
		for i := 0; i < len(q.para1); i++ {
			fn := q.para1[i]
			v := q.para2[i]
			fmt.Printf("【input】: %v \t【values】: %v\n", fn, v)
			switch fn {
			case "ThroneInheritance":
				ins = ConstructorThroneInheritance(v[0])
			case "birth":
				ins.Birth(v[0], v[1])
			case "death":
				ins.Death(v[0])
			case "getInheritanceOrder":
				ret := q.ans[order]
				res := ins.GetInheritanceOrder()
				order += 1
				if !utils.DeepEqual(ret, res) {
					t.Errorf(`"%v" not equal to "%v"`, res, ret)
				}
			}
		}
	}
}
