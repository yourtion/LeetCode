import { runAllTest } from "../../utils/test"
/**
 * 面试题 17.10. 主要元素
 * 
 * @link https://leetcode-cn.com/problems/find-majority-element-lcci/
 */
function majorityElement(nums: number[]): number {
  let ret = -1;
  let count = 0;
  for (const n of nums) {
    if (count === 0) {
      ret = n;
    }
    if (n === ret) {
      count += 1;
    } else {
      count -= 1;
    }
  }
  count = 0;
  const length = nums.length;
  for (const num of nums) {
    if (num === ret) {
      count++;
    }
  }
  return count * 2 > length ? ret : -1;
};

runAllTest("20210709", majorityElement, [
  { args: [[1, 2, 5, 9, 5, 9, 5, 5, 5]], res: 5 },
  { args: [[3, 2]], res: -1 },
  { args: [[2, 2, 1, 1, 1, 2, 2]], res: 2 },
]);