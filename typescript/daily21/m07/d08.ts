import { runAllTest } from "../../utils/test"
/**
 * 930. 和相同的二元子数组
 * 
 * @link https://leetcode-cn.com/problems/binary-subarrays-with-sum/
 */
function numSubarraysWithSum(nums: number[], goal: number): number {
  let sum = 0;
  let cnt = new Map();
  let ret = 0;
  for (let num of nums) {
    cnt.set(sum, (cnt.get(sum) || 0) + 1);
    sum += num;
    ret += cnt.get(sum - goal) || 0;
  }
  return ret;
};

runAllTest("20210708", numSubarraysWithSum, [
  { args: [[1, 0, 1, 0, 1], 2], res: 4 },
  { args: [[0, 0, 0, 0, 0], 0], res: 15 },
]);