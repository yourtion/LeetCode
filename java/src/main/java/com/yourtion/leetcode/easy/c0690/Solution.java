package com.yourtion.leetcode.easy.c0690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * 690. 员工的重要性
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/employee-importance/
 */
public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> eMap = new HashMap<>(employees.size());
        Employee ep = null;
        for (Employee e : employees) {
            eMap.put(e.id, e);
            if (e.id == id) {
                ep = e;
            }
        }
        if (ep == null) {
            return 0;
        }
        int ret = ep.importance;
        Stack<Employee> stack = new Stack<>();
        for (int eId : ep.subordinates) {
            stack.push(eMap.get(eId));
        }
        while (!stack.empty()) {
            Employee es = stack.pop();
            ret += es.importance;
            for (int e : es.subordinates) {
                if (eMap.get(e) != null) {
                    stack.push(eMap.get(e));
                }
            }
        }
        return ret;
    }

    static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
}
