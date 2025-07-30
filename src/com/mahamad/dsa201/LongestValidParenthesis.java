package com.mahamad.dsa201;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String str = "()(()(())";
        System.out.println(LongestLength(str));
    }

    static int LongestLength(String str) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        stack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}
