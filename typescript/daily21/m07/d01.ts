import { runAllTest } from "../../utils/test"
/**
 * LCP 07. 传递信息
 * 
 * @link https://leetcode-cn.com/problems/chuan-di-xin-xi/
 */
function numWays(n: number, relation: number[][], k: number): number {
  let ways = 0;
  const edges = new Array(n).fill(0).map(() => new Array());

  for (const [src, dst] of relation) {
    edges[src].push(dst);
  }

  function dfs(index: number, steps: number) {
    if (steps === k) {
      if (index === n - 1) {
        ways++;
      }
      return;
    }
    const list = edges[index];
    for (const nextIndex of list) {
      dfs(nextIndex, steps + 1);
    }
  }

  dfs(0, 0);
  return ways;
};

runAllTest("20210701", numWays, [
  { args: [5, [[0, 2], [2, 1], [3, 4], [2, 3], [1, 4], [2, 0], [0, 4]], 3], res: 3 },
  { args: [3, [[0, 2], [2, 1]], 2], res: 0 },
]);