package com.mahamad.dsa201;

import java.util.Arrays;
import java.util.Stack;

public class FirstNextLarger {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString((findnextLarge(arr))));

    }

    static int[] findnextLarge(int[] arr) {
        int[] res = new int[arr.length];
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
