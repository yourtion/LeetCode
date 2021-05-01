package y2021m05

import "fmt"

type Employee struct {
	Id           int
	Importance   int
	Subordinates []int
}

func (e *Employee) String() string {
	return fmt.Sprintf("Employee[%d](%d)-%v", e.Id, e.Importance, e.Subordinates)
}

// 每日一题 20210501
//
// 690. 员工的重要性
// Link: https://leetcode-cn.com/problems/employee-importance/
func getImportance(employees []*Employee, id int) int {
	employeeMap := map[int]*Employee{}
	for _, employee := range employees {
		employeeMap[employee.Id] = employee
	}
	ret := 0
	queue := []int{id}
	for len(queue) > 0 {
		cur := queue[0]
		if e, ok := employeeMap[cur]; ok {
			ret += e.Importance
			if len(e.Subordinates) > 0 {
				queue = append(queue, e.Subordinates...)
			}
		}
		queue = queue[1:]
	}
	return ret
}
