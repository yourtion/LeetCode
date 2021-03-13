package y2021m03

// 每日一题 20210313
//
// 705. 设计哈希集合
// Link: https://leetcode-cn.com/problems/design-hashset/
type MyHashSet struct {
	buckets [][]int
}

const BucketCount = 769

/** Initialize your data structure here. */
func ConstructorMyHashSet() MyHashSet {
	return MyHashSet{buckets: make([][]int, BucketCount)}
}

func (set *MyHashSet) getBucket(key int) int {
	return key % BucketCount
}

func (set *MyHashSet) Add(key int) {
	bucket := set.getBucket(key)
	if set.buckets[bucket] == nil {
		set.buckets[bucket] = []int{key}
		return
	}
	for _, v := range set.buckets[bucket] {
		if v == key {
			return
		}
	}
	set.buckets[bucket] = append(set.buckets[bucket], key)
}

func (set *MyHashSet) Remove(key int) {
	bucket := set.getBucket(key)
	if set.buckets[bucket] == nil {
		return
	}
	newBucket := make([]int, len(set.buckets[bucket]))
	for _, v := range set.buckets[bucket] {
		if v != key {
			newBucket = append(newBucket, v)
		}
	}
	set.buckets[bucket] = newBucket
}

/** Returns true if this set contains the specified element */
func (set *MyHashSet) Contains(key int) bool {
	bucket := set.getBucket(key)
	if set.buckets[bucket] == nil {
		return false
	}
	for _, v := range set.buckets[bucket] {
		if v == key {
			return true
		}
	}
	return false
}
