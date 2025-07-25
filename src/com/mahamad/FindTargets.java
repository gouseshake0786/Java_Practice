package com.mahamad;

import java.util.ArrayList;

public class FindTargets {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 15, 18, 23, 34, 38, 5, 23, 34, 23};
        int target = 23;

        ArrayList<Integer> ans = findIndexAll(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    private static ArrayList<Integer> findIndexAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);

        return findIndexAll(arr, target, index + 1, list);
    }
}
