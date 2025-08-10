package com.mahamad;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        permutations("", "abc");
        int[] arr = {1, 2, 3};
        permutationsArr("", arr);
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static void permutationsArr(String p, int[] arr) {
        if (arr.length == 0) {
            System.out.println(p);
            return;
        }
        int ch = arr[0];
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutationsArr(f + ch + s, Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
