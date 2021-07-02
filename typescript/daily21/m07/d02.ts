import { runAllTest } from "../../utils/test"
/**
 * 
 * 1833. 雪糕的最大数量
 * @link https://leetcode-cn.com/problems/maximum-ice-cream-bars/
 */
function maxIceCream(costs: number[], coins: number): number {
  const cs = [...costs].sort((a, b) => a - b);
  let ret = 0;
  for (const c of cs) {
    if (coins < c) {
      return ret;
    }
    coins -= c;
    ret += 1;
  }
  return ret;
};

runAllTest("20210702", maxIceCream, [
  { args: [[1, 3, 2, 4, 1], 7], res: 4 },
  { args: [[10, 6, 8, 7, 7, 8], 5], res: 0 },
  { args: [[1, 6, 3, 1, 2, 5], 20], res: 6 },
  { args: [[10, 2, 10, 10, 10, 10, 8, 2, 7, 8], 25], res: 4 },
]);