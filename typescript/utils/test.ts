/**
 * 两个值是否相等
 */
function deepEqual(x: unknown, y: unknown): boolean {
  if (x === y) {
    return true;
  }
  if (!(typeof x == "object" && x != null) || !(typeof y == "object" && y != null)) {
    return false;
  }
  //比较对象内部
  if (Object.keys(x).length != Object.keys(y).length) {
    return false;
  }
  for (var prop in x) {
    if (!y.hasOwnProperty(prop)) {
      return false;
    }
    if (!deepEqual((x as any)[prop], (y as any)[prop])) {
      return false;
    }
  }
  return true;
}

/**
 * 执行测试
 * @param fn 待测试方法
 * @param args 测试参数
 * @param res 预期结果
 */
function runTest<T extends FN>(fn: T, args: Parameters<T>[], res: ReturnType<T>) {
  const ret = fn(...args)
  console.error(`【input】:${JSON.stringify(args)} \t【output】:${JSON.stringify(ret)}`)
  console.assert(deepEqual(ret, res), `"${ret}" not equal to "${res}"`)
}

type FN = (...args: any) => any;
/**
 * 运行所有测试
 * @param title 标题
 * @param fn 待测试方法
 * @param tests 测试数据集和验证结果
 */
export function runAllTest<T extends FN>(title: string, fn: T, tests: { args: Parameters<T>, res: ReturnType<T> }[]) {
  console.log(`------------------------Leetcode <${title || fn.name}>------------------------`)
  for (const c of tests) {
    runTest(fn, c.args, c.res)
  }
}
