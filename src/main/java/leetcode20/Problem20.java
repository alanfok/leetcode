package leetcode20;

import java.util.Stack;

public class Problem20 {

    public boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '{') {
                stack.add("{");
            } else if (str[i] == '(') {
                stack.add("(");
            } else if (str[i] == '[') {
                stack.add("[");
            } else if (str[i] == '}') {
                if (stack.isEmpty() || !stack.pop().equals("{")) {
                    return false;
                }
            } else if (str[i] == ')') {
                if (stack.isEmpty() || !stack.pop().equals("(")) {
                    return false;
                }
            } else if (str[i] == ']') {
                if (stack.isEmpty() || !stack.pop().equals("[")) {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
