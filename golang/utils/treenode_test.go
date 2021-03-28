package utils

import (
	"fmt"
	"reflect"
	"testing"
)

func TestTreeNode(t *testing.T) {
	tests := [][]int{
		{1, 2, 3, 4, 5},
		{7, 3, 15, NULL, NULL, 9, 20},
		{},
	}
	for _, tt := range tests {
		name := fmt.Sprintf("ListNode: %v", tt)
		t.Run(name, func(t *testing.T) {
			got := NewTreeNode(tt)
			res := got.ToIntArr()
			if !reflect.DeepEqual(res, tt) {
				t.Errorf("NewTreeNode() = %v, want %v", res, tt)
			}
			g2 := NewTreeNode(res)
			if !g2.Equal(got) {
				t.Errorf("Equal() = %v, want %v", res, tt)
			}
		})
	}
}
