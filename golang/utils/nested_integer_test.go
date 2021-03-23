package utils

import "testing"

func Test_NestedInteger(t *testing.T) {
	n := NestedInteger{}

	if n.IsInteger() != true {
		t.FailNow()
	}

	n.SetInteger(1)
	if n.GetInteger() != 1 {
		t.FailNow()
	}

	elem := NestedInteger{Num: 1}

	expected := NestedInteger{
		Num: 1,
		Ns:  []*NestedInteger{&elem},
	}
	n.Add(elem)

	if !DeepEqual(expected, n) {
		t.FailNow()
	}

	if !DeepEqual(expected.Ns, n.GetList()) {
		t.FailNow()
	}

	t.Log(n)
}

func Test_ConstructorNestedInteger(t *testing.T) {
	n := ConstructorNestedInteger("[[1,1],2,[1,1]]")
	t.Log(n)
	if n.String() != "[ [ 1, 1 ], 2, [ 1, 1 ] ]" {
		t.FailNow()
	}
}
