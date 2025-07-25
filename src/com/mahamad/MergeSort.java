package com.mahamad;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;

        int mid = startIndex + (endIndex - startIndex) / 2;
        divide(arr, startIndex, mid);
        divide(arr, mid + 1, endIndex);

        conquer(arr, startIndex, mid, endIndex);
    }

    private static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int[] merge = new int[endIndex - startIndex + 1];
        int idx1 = startIndex;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= endIndex) {
            if (arr[idx1] < arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= endIndex) {
            merge[x++] = arr[idx2++];
        }

        for (int i = 0, j = startIndex; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }
}
