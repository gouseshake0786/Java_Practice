package com.mahamad;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 9, 13, 15, 19};
        int target = 9;
        int res = search(arr, target, 0, arr.length - 1);
        System.out.println(res);
        Math.sqrt(12);
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] < target)
            return search(arr, target, mid + 1, end);
        return search(arr, target, start, mid - 1);
    }
}
