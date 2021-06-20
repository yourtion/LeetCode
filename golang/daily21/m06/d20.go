package y2021m06

// 每日一题 20210620
//
// 1600. 皇位继承顺序
// Link: https://leetcode-cn.com/problems/throne-inheritance/
type ThroneInheritance struct {
	king  string
	edges map[string][]string
	dead  map[string]bool
}

func ConstructorThroneInheritance(kingName string) (t ThroneInheritance) {
	return ThroneInheritance{kingName, map[string][]string{}, map[string]bool{}}
}

func (t *ThroneInheritance) Birth(parentName, childName string) {
	t.edges[parentName] = append(t.edges[parentName], childName)
}

func (t *ThroneInheritance) Death(name string) {
	t.dead[name] = true
}

func (t *ThroneInheritance) GetInheritanceOrder() []string {
	var preorder func(string)
	var ret []string
	preorder = func(name string) {
		if !t.dead[name] {
			ret = append(ret, name)
		}
		for _, childName := range t.edges[name] {
			preorder(childName)
		}
	}
	preorder(t.king)
	return ret
}
