import { runAllTest } from "../../utils/test"
/**
 * 1418. 点菜展示表
 * 
 * @link https://leetcode-cn.com/problems/display-table-of-food-orders-in-a-restaurant/
 */
function displayTable(orders: string[][]): string[][] {
  const tableMap: Record<string, Record<string, number>> ={};
  const header = new Set<string>();
  for (const order of orders) {
    const table = order[1];
    if (!tableMap[table]) {
      tableMap[table] = {}
    }
    header.add(order[2])
    tableMap[table][order[2]] = tableMap[table][order[2]] ? tableMap[table][order[2]] + 1 : 1
  }
  const sortedTableKeys = Object.keys(tableMap).map(k => parseInt(k, 10)).sort((a, b) => a - b);
  const ret = [];
  const sortedHeader = Array.from(header).sort()
  ret[0] = ["Table", ...sortedHeader];
  for (const table of sortedTableKeys) {
    const row:string[] = [];
    const id = table + "";
    row[0] = id; 
    for(const h of sortedHeader) {
      row.push((tableMap[id][h] || 0) + "");
    }
    ret.push(row)
  }
  return ret;
};

runAllTest("20210706", displayTable, [
  {
    args: [[["David", "3", "Ceviche"], ["Corina", "10", "Beef Burrito"], ["David", "3", "Fried Chicken"], ["Carla", "5", "Water"], ["Carla", "5", "Ceviche"], ["Rous", "3", "Ceviche"]]],
    res: [["Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"], ["3", "0", "2", "1", "0"], ["5", "0", "1", "0", "1"], ["10", "1", "0", "0", "0"]]
  },
]);