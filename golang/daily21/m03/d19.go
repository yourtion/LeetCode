package y2021m03

// 每日一题 20210319
//
// 1603. 设计停车系统
// Link: https://leetcode-cn.com/problems/design-parking-system/
type ParkingSystem struct {
	left [4]int
}

func ConstructorParkingSystem(big int, medium int, small int) ParkingSystem {
	return ParkingSystem{[4]int{0, big, medium, small}}
}

func (s *ParkingSystem) AddCar(carType int) bool {
	if s.left[carType] > 0 {
		s.left[carType]--
		return true
	}
	return false
}
