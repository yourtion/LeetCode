import { runAllTest } from "../../utils/test"
/**
 * 645. 错误的集合
 * 
 * @link https://leetcode-cn.com/problems/set-mismatch/
 */
function findErrorNums(nums: number[]): number[] {
  const len = nums.length + 1;
  const counter: number[] = new Array(len);
  for (const n of nums) {
    counter[n] = counter[n] ? counter[n] + 1 : 1;
  }
  const ret = [0, len];
  for (let i = 1; i < len; i++) {
    if (counter[i] === 2) {
      ret[0] = i;
    } else if (!counter[i]) {
      ret[1] = i;
    }
  }
  return ret;
};

runAllTest("20210704", findErrorNums, [
  { args: [[1, 2, 2, 4]], res: [2, 3] },
  { args: [[1, 1]], res: [1, 2] },
]);