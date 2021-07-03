import { runAllTest } from "../../utils/test"
/**
 * 451. 根据字符出现频率排序
 * 
 * @link https://leetcode-cn.com/problems/sort-characters-by-frequency/
 */
function frequencySort(s: string): string {
  const counter = s.split("").reduce((pre, cur) => {
    pre[cur] = pre[cur] ? pre[cur] + 1 : 1;
    return pre;
  }, Object.create(null) as Record<string, number>)
  return Object.entries(counter).sort((a, b) => b[1] - a[1]).map(v => v[0].repeat(v[1])).join("");
};

runAllTest("20210703", frequencySort, [
  { args: ["tree"], res: "eetr" },
  { args: ["cccaaa"], res: "cccaaa" },
  { args: ["Aabb"], res: "bbAa" },
]);