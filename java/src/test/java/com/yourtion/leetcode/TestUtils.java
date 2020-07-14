package com.yourtion.leetcode;

import com.yourtion.leetcode.utils.ListNode;
import com.yourtion.leetcode.utils.Node;
import com.yourtion.leetcode.utils.TreeNode;
import com.yourtion.leetcode.utils.json.Json;
import com.yourtion.leetcode.utils.json.JsonArray;
import com.yourtion.leetcode.utils.json.JsonValue;

import java.util.*;

public class TestUtils {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String[] stringToStringArray(String input) {
        String[] in = input.split(",");
        String[] arr = new String[in.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in[i].trim();
        }
        return arr;
    }

    public static List<String> stringToStringList(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asString();
        }
        return Arrays.asList(arr);
    }

    public static List<List<String>> stringToString2dArray(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        if (jsonArray.size() == 0) {
            return new ArrayList<>();
        }
        List<List<String>> list = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            list.add(stringToStringList(cols.toString()));
        }
        return list;
    }

    public static List<Integer> stringToIntegerList(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        Integer[] arr = new Integer[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asInt();
        }
        return Arrays.asList(arr);
    }

    public static List<List<Integer>> stringToInteger2dArray(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        if (jsonArray.size() == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            list.add(stringToIntegerList(cols.toString()));
        }
        return list;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static ListNode stringToListNodeWithCycle(String input, int pos) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        ListNode c = null;
        for (int i = 0; i < nodeValues.length; i++) {
            ptr.next = new ListNode(nodeValues[i]);
            if (i == pos) {
                c = ptr.next;
            }
            ptr = ptr.next;
            if (i == nodeValues.length - 1) {
                ptr.next = c;
            }
        }
        return dummyRoot.next;
    }

    public static ListNode combineList(ListNode tn1, ListNode tn2, int sk1, int sk2) {
        int i = 0;
        ListNode res = null;
        ListNode n = tn1;
        while (n != null) {
            if (sk1 == i) {
                res = n;
            }
            i += 1;
            n = n.next;
        }
        i = 0;
        n = tn2;
        while (n != null) {
            i += 1;
            if (sk2 == i) {
                n.next = res;
                break;
            }
            n = n.next;
        }
        return res;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        StringBuilder result = new StringBuilder();
        while (node != null) {
            result.append(node.val).append(", ");
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        StringBuilder output = new StringBuilder();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (node == null) {
                output.append("null, ");
                continue;
            }

            output.append(node.val).append(", ");
            if (node.left != null || node.right != null) {
                nodeQueue.add(node.left);
                nodeQueue.add(node.right);
            }
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result.append(number).append(", ");
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result.append(number).append(", ");
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static String int2dListToString(List<List<Integer>> nums) {
        if (nums.size() == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list : nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static String int2dArrayToString(int[][] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int[] item : array) {
            sb.append(TestUtils.integerArrayToString(item));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        if (jsonArray.size() == 0) {
            return new int[0][0];
        }

        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }

    public static char[][] stringToChar2dArray(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        if (jsonArray.size() == 0) {
            return new char[0][0];
        }

        char[][] arr = new char[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            int j = 0;
            arr[i] = new char[cols.size()];
            for (JsonValue v : cols) {
                arr[i][j++] = v.asString().charAt(0);
            }
        }
        return arr;
    }

    public static Node buildSampleNAryTree() {
        List<Node> c = new LinkedList<>();
        c.add(new Node(5));
        c.add(new Node(6));
        Node n1 = new Node(3, c);
        List<Node> c2 = new LinkedList<>();
        c2.add(n1);
        c2.add(new Node(2));
        c2.add(new Node(4));
        return new Node(1, c2);
    }
}
