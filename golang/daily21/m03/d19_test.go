package y2021m03

import (
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210319(t *testing.T) {
	utils.Segmentation("20210319")
	parkingSystem := ConstructorParkingSystem(1, 1, 0)
	// 返回 true ，因为有 1 个空的大车位
	if parkingSystem.AddCar(1) != true {
		t.FailNow()
	}
	// 返回 true ，因为有 1 个空的中车位
	if parkingSystem.AddCar(2) != true {
		t.FailNow()
	}
	// 返回 false ，因为没有空的小车位
	if parkingSystem.AddCar(3) != false {
		t.FailNow()
	}
	// 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
	if parkingSystem.AddCar(1) != false {
		t.FailNow()
	}
}
