package utils

import (
	"fmt"
	"reflect"
	"testing"
)

func TestListNode(t *testing.T) {
	tests := [][]int{
		{1, 2, 3, 4, 5},
		{},
	}
	for _, tt := range tests {
		name := fmt.Sprintf("ListNode: %v", tt)
		t.Run(name, func(t *testing.T) {
			got := NewListNode(tt)
			res := got.ToIntArr()
			if !reflect.DeepEqual(res, tt) {
				t.Errorf("NewListNode() = %v, want %v", res, tt)
			}
		})
	}
}
